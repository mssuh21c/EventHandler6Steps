package com.example.sensational.may29;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


    /* 1. call back method 재정의

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 1. call back method 재정의


//    protected class MyView extends View {
//        public MyView(Context context) {
//            super(context);
//        }
//    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Toast.makeText(MainActivity.this,"Touch Event Received",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

*/
    // 2. 리스너 인터페이스 구현

    /*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new View(this);
        vw.setOnTouchListener( TouchListener );

        setContentView(R.layout.activity_main);


    }

    class TouchListenerClass implements View.OnTouchListener {


        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Toast.makeText(MainActivity.this,"Touch Event Received",
                    Toast.LENGTH_SHORT).show();
            return true;

        }
    }

    TouchListenerClass TouchListener = new TouchListenerClass();


}

    */


//  3.  액티비티가 리스터 구현

/*

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View vw = new View(this);
//        vw.setOnTouchListener( TouchListener );
        vw.setOnTouchListener(this);

        setContentView(vw);

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(MainActivity.this,"Touch Event Received",
                Toast.LENGTH_SHORT).show();
        return true;
    }
}

*/


// 4. View 가 listener 구현

/*
public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView vw = new MyView(this);

        vw.setOnTouchListener(vw);
        setContentView(vw);

    }

    protected class MyView extends View implements View.OnTouchListener{
//        protected class MyView extends Button implements View.OnTouchListener{
        public MyView(Context context) {
            super(context);
        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Toast.makeText(MainActivity.this,"Touch Event Received",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
    }

}

*/


// 5. anonymous inner class 사용

