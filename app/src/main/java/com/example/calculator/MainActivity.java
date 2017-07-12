package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//Main activity is the name of the class
//AppCompatActivity is the parent class the word extends indicates inheritance
//View.OnClickListener is an interface inside the View class

//MainActivity es el nombre de la clase
//AppCompatActivity es la clase padre y usa la palabra clave extends para indicar herencia
//View.OnClickListener es una interfaz dentro de la clase View
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Referencia global de las vistas aun sin inicializar

    //Global reference of the views without initialisation
    TextView resTextView;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b0,b9,badd,bsub,bby,bbet,beq;

    //Este metodo se ejecuta cada vez que se crea un Activity
    //This method is executed every time that an Activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resTextView = (TextView) findViewById(R.id.resTextView);

        //Todos los recursos de la clase R regresa un int, este metodo transforma el id en una
        //vista y se transforma de nuevo al componente en si.
        //All resources from the R class returns an int, this method parses the id to the actual
        //view and it's casted to the component it is

        b1 = (Button) findViewById(R.id.b1);

        //Este metodo le asigna una interfaz que es la encargada de detectar el click en
        //el componente y llamar el metodo que la interfaz declara
        //This method assigns a interface which is the responsible to detect the click on the
        //component and call the method that the interface declares
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);


        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);

        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);

        badd = (Button) findViewById(R.id.badd);
        badd.setOnClickListener(this);

        bsub = (Button) findViewById(R.id.bsub);
        bsub.setOnClickListener(this);

        bby = (Button) findViewById(R.id.bby);
        bby.setOnClickListener(this);

        bbet = (Button) findViewById(R.id.bbet);
        bbet.setOnClickListener(this);

        beq = (Button) findViewById(R.id.bequals);
        beq.setOnClickListener(this);



    }

    //Este es el metodo que se llama al dar click a un component
    //This method is called when a component is clicked
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.badd:
                buttonClickedText(String.valueOf(badd.getText()));
                break;
            case R.id.bsub:
                buttonClickedText(String.valueOf(bsub.getText()));
                break;
            case R.id.bby:
                buttonClickedText(String.valueOf(bby.getText()));
                break;
            case R.id.bequals:
                buttonClickedText(String.valueOf(beq.getText()));
                break;
            case R.id.bbet:
                buttonClickedText(String.valueOf(bbet.getText()));
                break;
            case R.id.b1:
                buttonClickedText(String.valueOf(b1.getText()));
                break;
            case R.id.b2:
                buttonClickedText(String.valueOf(b2.getText()));
                break;
            case R.id.b3:
                buttonClickedText(String.valueOf(b3.getText()));
                break;
            case R.id.b4:
                buttonClickedText(String.valueOf(b4.getText()));
                break;
            case R.id.b5:
                buttonClickedText(String.valueOf(b5.getText()));
                break;
            case R.id.b6:
                buttonClickedText(String.valueOf(b6.getText()));
                break;
            case R.id.b7:
                buttonClickedText(String.valueOf(b7.getText()));
                break;
            case R.id.b8:
                buttonClickedText(String.valueOf(b8.getText()));
                break;
            case R.id.b9:
                buttonClickedText(String.valueOf(b9.getText()));
                break;
            case R.id.b0:
                buttonClickedText(String.valueOf(b0.getText()));
                break;
        }
    }

        public void buttonClickedText(String buttonText){
            resTextView.setText(buttonText);
        }

}
