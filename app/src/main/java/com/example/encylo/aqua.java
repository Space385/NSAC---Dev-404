package com.example.encylo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class aqua extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua);
        textView = (TextView)findViewById(R.id.aquatext);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(R.string.AQUA);
    }
    public void goto1(View view)
    {
        Intent intent = new Intent(this ,menu.class);
        startActivity(intent);

    }
}