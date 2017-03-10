package mx.edu.cetis108.cetis1084am_app002;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public  void btnSuma_click(View v)
    {
        EditText num1,num2;
        num1=(EditText)findViewById(R.id.txtNumero1);
        num2=(EditText)findViewById(R.id.txtNumero2);
        final TextView lblResultado=(TextView)findViewById(R.id.lblResultado);


        double aux1=Double.valueOf(num1.getText().toString());
        double aux2=Double.valueOf(num2.getText().toString());
        double resuultado= aux1+aux2;
        lblResultado.setText("La suma es " +resuultado);




    }

    public  void btnResta_click(View v)
    {
        EditText num1,num2;
        num1=(EditText)findViewById(R.id.txtNumero1);
        num2=(EditText)findViewById(R.id.txtNumero2);
        final TextView lblResultado=(TextView)findViewById(R.id.lblResultado);


        double aux1=Double.valueOf(num1.getText().toString());
        double aux2=Double.valueOf(num2.getText().toString());

        double resuultado= aux1-aux2;
        lblResultado.setText("La resta es " +resuultado);



    }

    public void btnMultiplicacion_click(View v)
    {

        EditText num1,num2;
        num1=(EditText)findViewById(R.id.txtNumero1);
        num2=(EditText)findViewById(R.id.txtNumero2);
        final TextView lblResultado=(TextView)findViewById(R.id.lblResultado);


        double aux1=Double.valueOf(num1.getText().toString());
        double aux2=Double.valueOf(num2.getText().toString());
        double resuultado= aux1*aux2;
        lblResultado.setText("La Multiplicacion es " +resuultado);




    }

    public  void btnDividir_click(View v)
    {


        EditText num1,num2;
        num1=(EditText)findViewById(R.id.txtNumero1);
        num2=(EditText)findViewById(R.id.txtNumero2);
        final TextView lblResultado=(TextView)findViewById(R.id.lblResultado);


        double aux1=Double.valueOf(num1.getText().toString());
        double aux2=Double.valueOf(num2.getText().toString());
        double resuultado= aux1/aux2;
        lblResultado.setText("La Division es " +resuultado);

    }

}
