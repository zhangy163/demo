package com.zhangy.dateandtimedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker firstTimePicker;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTimePicker= (TimePicker) findViewById(R.id.firstTimePicker);
        button= (Button) findViewById(R.id.button);

        //显示24小时制
        firstTimePicker.setIs24HourView(true);

        TimeListener timeListener=new TimeListener();
        ButtonListener buttonListener=new ButtonListener();
        button.setOnClickListener(buttonListener);
        //将OnTimeChangedListener绑定在TimePicker中
        firstTimePicker.setOnTimeChangedListener(timeListener);

    }
    class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            int hour=firstTimePicker.getCurrentHour();
            int minute=firstTimePicker.getCurrentMinute();

        }
    }
    class TimeListener implements TimePicker.OnTimeChangedListener{

        /**
         *
         * @param timePicker 代表的TimePicker
         * @param i  代表的用户所选择的小时
         * @param i1 代表的用户所选择的分钟
         */
        @Override
        public void onTimeChanged(TimePicker timePicker, int hour, int minute) {


        }
    }
}
