package com.example.calcbeneficio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView alc;
    private TextView gsl;
    private TextView txtView;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alc = findViewById(R.id.txtAcl);
        gsl = findViewById(R.id.txtGsl);
        calc = findViewById(R.id.bCalc);
        txtView = findViewById(R.id.txtView);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alcValor = alc.getText().toString();
                String gslValor = gsl.getText().toString();

                float alcValorA = Integer.parseInt(alcValor);
                float gslValorB = Integer.parseInt(gslValor);
                float ttValor;

                ttValor = alcValorA/gslValorB;


                if(gslValor.isEmpty()||alcValor.isEmpty()){

                    //msg erro
                }else if (ttValor < 0.7){
                    txtView.setText("Etanol gerara um melhor custo beneficio");

                }else{
                    txtView.setText("Gasolina gerara um melhor custo beneficio");
                }
                            }
        });

    }
}
