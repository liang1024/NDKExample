package com.lz.jnidatatype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Jni mJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJni = new Jni();
    }

    public void bt_string(View view) {
        Toast.makeText(this, mJni.geText(), Toast.LENGTH_SHORT).show();
    }

    public void bt_addint(View view) {
        Toast.makeText(this, "通过JNI计算出的值:" + mJni.add(10, 20), Toast.LENGTH_SHORT).show();
    }
}
