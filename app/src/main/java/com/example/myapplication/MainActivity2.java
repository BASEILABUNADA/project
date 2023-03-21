package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textcinter);
        TextView textView1 = findViewById(R.id.textcinter1);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("edit_name"));
      textView1.setText(intent.getIntExtra("edit_password" ,-1));
//        Toast.makeText(this, " My Application ", Toast.LENGTH_SHORT).show();
//        button .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
        textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
    }
}