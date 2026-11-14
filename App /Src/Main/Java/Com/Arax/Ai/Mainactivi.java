package com.arax.ai;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello! I am ARAX AI.");
        text.setTextSize(26);
        text.setPadding(30, 100, 30, 30);

        setContentView(text);
    }
}
