package thedorkknightrises.portfolio;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent= new Intent(MainActivity.this, About.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBtnClick(View view) {
        if (view==findViewById(R.id.btn1)||view==findViewById(R.id.btnt1))
        {
            PackageManager pm = getPackageManager();
            try {
                String packageName = "thedorkknightrises.moviespop";
                Intent launchIntent = pm.getLaunchIntentForPackage(packageName);
                startActivity(launchIntent);
            } catch (Exception e1) {
                Toast.makeText(MainActivity.this, "App not installed!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (view==findViewById(R.id.btn2)||view==findViewById(R.id.btnt2))
        {
            PackageManager pm = getPackageManager();
            try {
                String packageName = "thedorkknightrises.stockhawk";
                Intent launchIntent = pm.getLaunchIntentForPackage(packageName);
                startActivity(launchIntent);
            } catch (Exception e1) {
                Toast.makeText(MainActivity.this, "App not installed!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (view==findViewById(R.id.btn3)||view==findViewById(R.id.btnt3))
        {
            PackageManager pm = getPackageManager();
            try {
                String packageName = "thedorkknightrises.jokesapp.donate";
                Intent launchIntent = pm.getLaunchIntentForPackage(packageName);
                startActivity(launchIntent);
            } catch (Exception e1) {
                try {
                    String packageName = "thedorkknightrises.jokesapp.free";
                    Intent launchIntent = pm.getLaunchIntentForPackage(packageName);
                    startActivity(launchIntent);
                } catch (Exception e2) {
                    Toast.makeText(MainActivity.this, "App not installed!", Toast.LENGTH_SHORT).show();
                }
            }
        }
        else
        Toast.makeText(MainActivity.this, "App not installed!", Toast.LENGTH_SHORT).show();
    }
}
