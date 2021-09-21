package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAnswer(int n) {
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer",n);
        startActivity(intent);
    }

    public void addFunction(View view) {
        EditText leftInput = (EditText) findViewById(R.id.leftInput);
        EditText rightInput = (EditText) findViewById(R.id.rightInput);
        int n = Integer.parseInt(leftInput.getText().toString()) + Integer.parseInt(rightInput.getText().toString());
        showAnswer(n);
    }

    public void subtractFunction(View view) {
        EditText leftInput = (EditText) findViewById(R.id.leftInput);
        EditText rightInput = (EditText) findViewById(R.id.rightInput);
        int n = Integer.parseInt(leftInput.getText().toString()) - Integer.parseInt(rightInput.getText().toString());
        showAnswer(n);
    }
    public void multiplyFunction(View view) {
        EditText leftInput = (EditText) findViewById(R.id.leftInput);
        EditText rightInput = (EditText) findViewById(R.id.rightInput);
        int n = Integer.parseInt(leftInput.getText().toString()) * Integer.parseInt(rightInput.getText().toString());
        showAnswer(n);
    }
    public void divideFunction(View view) {
        EditText leftInput = (EditText) findViewById(R.id.leftInput);
        EditText rightInput = (EditText) findViewById(R.id.rightInput);
        int n = Integer.parseInt(leftInput.getText().toString()) / Integer.parseInt(rightInput.getText().toString());
        showAnswer(n);
    }
}