package com.example.a2_monthclasswork7calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer first, second;
    private boolean isOperationClick;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }


    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
            case R.id.btn_point:
                textView.setText(".");
                textView.setText(R.id.text_view + ".");
                break;
            case R.id.btn_minus:
                textView.setText("-");
                break;
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                isOperationClick = false;
                break;

            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                isOperationClick = false;
                break;

            case R.id.btn_three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                isOperationClick = false;
                break;

            case R.id.btn_four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                isOperationClick = false;
                break;

            case R.id.btn_five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                isOperationClick = false;
                break;

            case R.id.btn_six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                isOperationClick = false;
                break;

            case R.id.btn_seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                isOperationClick = false;
                break;

            case R.id.btn_eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                isOperationClick = false;
                break;

            case R.id.btn_nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                isOperationClick = false;
                break;

            case R.id.btn_null:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                isOperationClick = false;
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                first = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.btn_equal:
                second = Integer.parseInt(textView.getText().toString());
                Integer result = first + second;
                textView.setText(result.toString());
                isOperationClick = true;
                operation = "=";
                break;
            case R.id.btn_minus:
                isOperationClick = true;
                result = first - second;
                operation = "-";
                break;
            case R.id.btn_multi:
                isOperationClick = true;
                result = first * second;
                textView.setText(result.toString());
                operation = "×";
                break;
            case R.id.btn_division:
                result = first / second;
                textView.setText(result.toString());
                isOperationClick = true;
                operation = "÷";
                break;
            case R.id.btn_percent:
                isOperationClick = true;
                operation = "%";
                result = (first / 100);
                textView.setText(result.toString());
                break;
        }
    }
}
//        switch (view.getId()) {
//                case R.id.btn_plus:
//                first = Integer.parseInt(textView.getText().toString());
//                isOperationClick = true;
//                break;
//                case R.id.btn_equal:
//                second = Integer.parseInt(textView.getText().toString());
//                Integer result = first + second;
//                textView.setText(result.toString());
//                isOperationClick = true;
//                break;
//                case R.id.btn_minus:
//                break;
