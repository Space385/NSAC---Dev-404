package com.example.encylo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class aquarius extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquarius);
        textView = (TextView)findViewById(R.id.aquariustext);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(R.string.AQUARIUS);
    }
    public void goto1(View view)
    {
        Intent intent = new Intent(this ,menu.class);
        startActivity(intent);

    }
}