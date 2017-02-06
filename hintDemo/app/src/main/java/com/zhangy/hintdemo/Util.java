package com.zhangy.hintdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * zhangy
 * Created by Administrator on 2017/2/6 0006.
 */

public class Util {

    private static Toast toast;

    public static void showToast(Context context, String content){

        if(toast==null)
        {
            toast=Toast.makeText(context,content,Toast.LENGTH_LONG);
        }else {
            toast.setText(content);
        }
    }
}
