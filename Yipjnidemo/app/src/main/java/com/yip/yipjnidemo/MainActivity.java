package com.yip.yipjnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView= (TextView) findViewById(R.id.text);

        JniText jniText=new JniText();
        txtView.setText(jniText.getCLangString());
    }
}
