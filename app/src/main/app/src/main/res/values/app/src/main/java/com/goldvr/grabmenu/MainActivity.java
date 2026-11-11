package com.goldvr.grabmenu;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setPadding(25, 25, 25, 25);
        layout.setBackgroundColor(Color.rgb(18, 11, 29));

        TextView title = new TextView(this);
        title.setText("GRAB VR MOD MENU");
        title.setTextSize(25);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        layout.addView(title);

        addToggle("Menu Enabled");
        addToggle("Fly (Demo)");
        addToggle("Speed Boost (Demo)");
        addToggle("Super Jump (Demo)");
        addToggle("Hand Platforms (Demo)");
        addToggle("Low Gravity (Demo)");

        setContentView(layout);
    }

    void addToggle(String name) {
        Switch button = new Switch(this);
        button.setText(name);
        button.setTextColor(Color.WHITE);
        button.setTextSize(18);
        button.setPadding(10, 20, 10, 20);
        layout.addView(button);
    }
}
