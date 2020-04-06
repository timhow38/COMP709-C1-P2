package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.os.Message;
import static com.example.myapplication.ExampleHandler.TASK_A;
import static com.example.myapplication.ExampleHandler.TASK_B;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ExampleLooperThread looperThread = new ExampleLooperThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startThread(View view) {
        looperThread.start();
    }

    public void stopThread(View view) {
        looperThread.looper.quit();
    }

    public void taskA(View view) {
        Message msg = Message.obtain();
        msg.what = TASK_A;
        looperThread.handler.sendMessage(msg);
    }

    public void taskB(View view) {
        Message msg = Message.obtain();
        msg.what = TASK_B;
        looperThread.handler.sendMessage(msg);
    }
}