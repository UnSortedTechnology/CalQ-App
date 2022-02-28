package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView e1;
    Button add, sub, mul, div, modulo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        e1 = (TextView)findViewById(R.id.result);


        add = (Button) findViewById(R.id.addition);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        modulo = (Button) findViewById(R.id.modulo);


    }

    public void onClickAdd(View view) {

        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        e1.setText(sum + "");
    }

    public void onClickSub(View view) {
        int sub = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        e1.setText(sub + "");

    }

    public void onClickMul(View view) {

        int mul = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        e1.setText(mul + "");
    }

    public void onClickDiv(View view) {
        int div = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        e1.setText(div + "");
    }

    public void onClickModulo(View view) {
        int modulo = Integer.parseInt(num1.getText().toString()) % Integer.parseInt(num2.getText().toString());
        e1.setText(modulo + "");
    }
}