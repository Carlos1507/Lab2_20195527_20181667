package ayala.carlos.lab2iot_loginandregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.system_bar));
        }

        Button buttonRegistro = findViewById(R.id.buttonRegistro);
        buttonRegistro.setEnabled(false);

        EditText nombre = findViewById(R.id.editTextTextPersonName);
        EditText numero = findViewById(R.id.editTextTextPersonNumber);
        EditText correo = findViewById(R.id.editTextTextPersonEmail);
        EditText contrasena = findViewById(R.id.editTextTextPersonPassword);

        CheckBox terminos = findViewById(R.id.checkBoxTerminos);
        CheckBox tratamientoDatos = findViewById(R.id.checkBox);

        terminos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked && tratamientoDatos.isChecked() &&
                        !nombre.getText().toString().isEmpty() &&
                        !numero.getText().toString().isEmpty() &&
                        !correo.getText().toString().isEmpty() &&
                        !contrasena.getText().toString().isEmpty()){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }
        });
        tratamientoDatos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked && terminos.isChecked() &&
                        !nombre.getText().toString().isEmpty() &&
                        !numero.getText().toString().isEmpty() &&
                        !correo.getText().toString().isEmpty() &&
                        !contrasena.getText().toString().isEmpty()){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }
        });
        nombre.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(terminos.isChecked() && tratamientoDatos.isChecked() &&
                        !numero.getText().toString().isEmpty() &&
                        !correo.getText().toString().isEmpty() &&
                        !contrasena.getText().toString().isEmpty() ){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numero.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(terminos.isChecked() && tratamientoDatos.isChecked() &&
                        !nombre.getText().toString().isEmpty() &&
                        !correo.getText().toString().isEmpty() &&
                        !contrasena.getText().toString().isEmpty() ){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        correo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(terminos.isChecked() && tratamientoDatos.isChecked() &&
                        !numero.getText().toString().isEmpty() &&
                        !nombre.getText().toString().isEmpty() &&
                        !contrasena.getText().toString().isEmpty() ){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        contrasena.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(terminos.isChecked() && tratamientoDatos.isChecked() &&
                        !numero.getText().toString().isEmpty() &&
                        !correo.getText().toString().isEmpty() &&
                        !nombre.getText().toString().isEmpty() ){
                    buttonRegistro.setEnabled(true);
                }else{
                    buttonRegistro.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        buttonRegistro.setOnClickListener(view -> {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        });

        Button buttonInicio = findViewById(R.id.buttonLogin);
        buttonInicio.setOnClickListener(view -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });
    }
}