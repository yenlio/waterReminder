package com.example.app_nhom61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edTaiKhoan, edPassword;
    Button btdangNhap,btdangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();


        btdangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,home.class);
                startActivity(i);
            }
        });

    }

    public  void anhXa(){
        edTaiKhoan=(EditText) findViewById(R.id.tenDangNhap);
        edPassword= (EditText) findViewById(R.id.password);
        btdangNhap=(Button) findViewById(R.id.btDangNhap);
        btdangKy=(Button) findViewById(R.id.btDangKy);


    }
}