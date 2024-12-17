package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dlg
                        =new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("다이알로그창");
                dlg.setMessage("오늘은 당신이 주인공");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("ok",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,
                                "확인 완료",
                                Toast.LENGTH_LONG).show();
                    }
                }); // 이벤트 처리
                dlg.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,
                                "취소 완료",
                                Toast.LENGTH_LONG).show();
                    }
                }); // 이벤트 처리


                dlg.show();




              /*  Toast.makeText(MainActivity.this,
                        "눌렀지?",
                        Toast.LENGTH_LONG).show() ;*/
            }
        });
    }
}// dialog
