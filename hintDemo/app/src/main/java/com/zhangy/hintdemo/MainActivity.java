package com.zhangy.hintdemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dialog的用法
                showhintDialog();
                //Toast的用法
//                Util.showToast(getApplicationContext(),"things happend");
//                //Snackbar
//                showSnackbar(view);

            }
        });
    }

    public void showhintDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setTitle("Title")
                .setMessage("Dialog content.")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface d,
                                                int which) {
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface d,
                                                int which) {
                            }
                        })
                .show();
    }

    public void showSnackbar(View view){
        Snackbar.make(view, "data deleted",
                Snackbar.LENGTH_LONG)
                .setAction("Undo",
                        new View.OnClickListener(){
                            @Override
                            public void onClick(View v) {
                            }
                        })
                .show();
    }
}
