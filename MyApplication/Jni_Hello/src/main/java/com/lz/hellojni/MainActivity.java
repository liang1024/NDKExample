package com.lz.hellojni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //    3.调用并显示
        ((TextView) findViewById(R.id.text_show)).setText(HelloJniFromC());
    }

    //    1. 声明native方法
    public native String HelloJniFromC();

    //    2.加载library包
    static {
        System.loadLibrary("hellojni");
    }

}
