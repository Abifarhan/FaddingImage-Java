package com.example.faddingimage_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
    boolean change = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeAction(View view) {
         ImageView imageApel = (ImageView) findViewById(R.id.idApel);
         ImageView imageApelHijau = (ImageView) findViewById(R.id.idApelHijau);

        if (change) {
            change = false;
            imageApel.animate().alpha(0).setDuration(2000);
            imageApelHijau.animate().alpha(1).setDuration(2000);
        }
        else {
            change = true;
            imageApel.animate().alpha(1).setDuration(2000);
            imageApelHijau.animate().alpha(0).setDuration(2000);
        }
    }
}
