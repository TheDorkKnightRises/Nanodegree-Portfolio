package thedorkknightrises.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.res.Resources;
import android.widget.TextView;

public class About extends Activity{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
    public void dismiss(View view)
    {
        finish();
    }
}