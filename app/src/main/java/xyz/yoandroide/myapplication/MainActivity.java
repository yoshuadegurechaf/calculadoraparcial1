package xyz.yoandroide.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;

    private TextView text_respuesta;

    private EditText edit_numero_uno;
    private  EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_suma = findViewById(R.id.suma);
        btn_resta = findViewById(R.id.resta);
        btn_division = findViewById(R.id.division);
        btn_multiplicacion = findViewById(R.id.multiplicacion);

        text_respuesta = findViewById(R.id.respuesta);

        edit_numero_uno = findViewById(R.id.numero_uno);
        edit_numero_dos = findViewById(R.id.numero_dos);
    }
    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){
        return a-b;
    }
    public int division (int a, int b){
        return a/b;
    }
    public int multiplicacion (int a, int b){
        return a*b;
    }
}

