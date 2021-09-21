package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = (TextView) findViewById(R.id.answerText);
        Intent intent = getIntent();
        int n = intent.getIntExtra("answer",0);
        String str = "" + n;
        answerText.setText(str);
    }
}