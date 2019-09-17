package com.example.student.app_bai01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtKQ;
    EditText edtSoA, edtSoB;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUCLN, btnThoat;

    float soA, soB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtKQ = (TextView) findViewById(R.id.textKQ);
        edtSoA = (EditText) findViewById(R.id.edtSoA);
        edtSoB = (EditText) findViewById(R.id.edtSoB);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnHieu = (Button) findViewById(R.id.btnHieu);
        btnTich = (Button) findViewById(R.id.btnTich);
        btnThuong = (Button) findViewById(R.id.btnThuong);
        btnThoat = (Button) findViewById(R.id.btnThoat);

        soA = Float.parseFloat(edtSoA.getText().toString());
        soB = Float.parseFloat(edtSoB.getText().toString());

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kq = soA + soB;
                txtKQ.setText("Kết phép cộng quả: " + kq);
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kq = soA - soB;
                txtKQ.setText("Kết phép trừ quả: " + kq);
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float kq = soA * soB;
                txtKQ.setText("Kết phép nhân quả: " + kq);
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(soB == 0)
                    txtKQ.setText("Phép chia không xác định");
                else {
                    float kq = soA / soB;
                    txtKQ.setText("Kết phép cộng quả: " + kq);
                }
            }
        });



        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
