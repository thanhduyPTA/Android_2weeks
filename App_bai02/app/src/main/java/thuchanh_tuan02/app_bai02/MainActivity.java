package thuchanh_tuan02.app_bai02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edDoC, edDoF;
    Button btnToFahrenheit, btnToCelsius, btnClear;

    float doC, doF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edDoC = findViewById(R.id.edDoC);
        edDoF = findViewById(R.id.edDoF);
        btnToCelsius = findViewById(R.id.btnToCelsius);
        btnToFahrenheit = findViewById(R.id.btnToFahrenheit);
        btnClear = findViewById(R.id.btnClear);

        btnToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doF = Float.parseFloat(edDoF.getText().toString());
                float toCelsius = (doF - 32) * 5 / 9;
                edDoC.setText(toCelsius + "");
            }
        });

        btnToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doC = Float.parseFloat(edDoC.getText().toString());
                float toFahrenheit = doC * 9 / 5 + 32;
                edDoF.setText(toFahrenheit + "");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edDoC.setText("");
                edDoF.setText("");
            }
        });
    }
}
