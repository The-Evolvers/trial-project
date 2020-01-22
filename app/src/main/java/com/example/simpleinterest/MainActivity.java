package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Im Abhi

        final EditText e1 = (EditText) findViewById(R.id.principle);
        final EditText e2 = (EditText) findViewById(R.id.time1);
        final EditText e3 = (EditText) findViewById(R.id.rate);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        final TextView t1 = (TextView) findViewById(R.id.result);
        final Button btn1 = (Button)findViewById(R.id.id);

//IM Kaushik.
//IM Abhishek
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                double p = new Double(e1.getText().toString());
                double t = new Double(e2.getText().toString());
                double r = new Double(e3.getText().toString());

                double interest = (p*t*r)/100;

                t1.setText(interest+"");

                Toast.makeText(getApplicationContext(),interest+"",Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e3.setText("");
            }
        });

    }
}
