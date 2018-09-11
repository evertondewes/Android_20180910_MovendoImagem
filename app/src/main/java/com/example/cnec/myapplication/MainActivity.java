package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imageView2);

        iv.setOnTouchListener(new View.OnTouchListener() {
            float dX, dY;
            @Override
            public boolean onTouch(View v, MotionEvent motion) {
                switch (motion.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        dX = v.getX() - motion.getRawX();
                        dY = v.getY() - motion.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        v.setX(motion.getRawX() + dX);
                        v.setY(motion.getRawY() + dY);
                        break;
                    default:
                        return false;
                }

                return true;
            }
        });

    }
}
