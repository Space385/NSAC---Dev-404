package com.example.encylo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class atlas extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atlas);
        textView = (TextView)findViewById(R.id.atlastext);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText(R.string.ATLAS);
    }
    public void goto1(View view)
    {
        Intent intent = new Intent(this ,menu.class);
        startActivity(intent);

    }
}