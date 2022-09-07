package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText chieuCao, canNang;
    Button btTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Tính BMI
                double height = Double.parseDouble(chieuCao.getText().toString());
                double weight = Double.parseDouble(canNang.getText().toString());

                double bmi = weight / (height * height);

                result.setText(String.valueOf(bmi));
            }
        });
    }
    private void AnhXa(){
        chieuCao = (EditText) findViewById(R.id.txtChieuCao);
        canNang = (EditText) findViewById(R.id.txtCanNang);
        btTinh = (Button) findViewById(R.id.btTinh);
        result = (TextView) findViewById(R.id.txtResult);
    }
}