package com.example.lesson_7dom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button sh;
    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;
    private Boolean lol = true;

    protected void onStart()
    {
        super.onStart();
        if(MainActivity2.fi==false)
        {
            MainActivity2.fi=true;
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        sh=findViewById(R.id.share);
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                String text = tvResult.getText().toString();
                intent.putExtra("key",text);

                startActivity(intent);
            }
        });


    }

    public void onNumberClick(View view) {
        sh.setVisibility(View.INVISIBLE);
        switch (view.getId()) {
            case R.id.btn_zero:
                if(tvResult.getText().toString().equals("0"))
                {
                    tvResult.append("");
                }
                else {
                    tvResult.append("0");
                }
                break;
            case R.id.btn_one:
                if (!lol) {
                    tvResult.setText("1");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("1");
                    } else {
                        tvResult.append("1");
                    }
                }

                break;
            case R.id.btn_two:
                if (!lol) {
                    tvResult.setText("2");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("2");
                    } else {
                        tvResult.append("2");
                    }
                }

                break;
            case R.id.btn_three:
                if (!lol) {
                    tvResult.setText("3");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("3");
                    } else {
                        tvResult.append("3");
                    }
                }

                break;
            case R.id.btn_four:
                if (!lol) {
                    tvResult.setText("4");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("4");
                    } else {
                        tvResult.append("4");
                    }
                }

                break;
            case R.id.btn_five:
                if (!lol) {
                    tvResult.setText("5");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("5");
                    } else {
                        tvResult.append("5");
                    }
                }

                break;
            case R.id.btn_six:
                if (!lol) {
                    tvResult.setText("6");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("6");
                    } else {
                        tvResult.append("6");
                    }
                }

                break;
            case R.id.btn_seven:
                if (!lol) {
                    tvResult.setText("7");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("7");
                    } else {
                        tvResult.append("7");
                    }
                }

                break;
            case R.id.btn_eight:
                if (!lol) {
                    tvResult.setText("8");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("8");
                    } else {
                        tvResult.append("8");
                    }
                }

                break;
            case R.id.btn_nine:
                if (!lol) {
                    tvResult.setText("9");
                    lol = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("9");
                    } else {
                        tvResult.append("9");
                    }
                }

                break;
            case R.id.btn_clear:
                tvResult.setText("");
                break;

        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_mul:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "*";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_del:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "/";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_equal:
                sh.setVisibility(View.VISIBLE);
                String result = null;
                String two = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(two);

                if (operation.equals("+")) {
                    result = String.valueOf(firstValue + secondValue);
                } else if (operation.equals("-")) {
                    result = String.valueOf(firstValue - secondValue);
                } else if (operation.equals("*")) {
                    result = String.valueOf(firstValue * secondValue);
                } else if (operation.equals("/")) {
                    if (secondValue==0)
                    {
                        result="на ноль делить нельзя";

                    } else {result = String.valueOf(firstValue / secondValue);
                }}



                tvResult.setText((firstValue + operation + secondValue + " = " + result));
                lol = false;
                break;
        }
    }
}