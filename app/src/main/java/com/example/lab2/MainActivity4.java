package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity4 extends AppCompatActivity {

    private MaterialToolbar materialToolbar;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        materialToolbar = findViewById(R.id.materialToolbar);
        materialToolbar.setTitle("Elije tu asiento");
        materialToolbar.setTitleCentered(false);
        setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        button = findViewById(R.id.button87);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarDialogo();
            }
        });

    }

    private void mostrarDialogo() {
        new AlertDialog.Builder(this)
                .setTitle("Felicidades!!")
                .setMessage("Su compra de 2 tickets con un valor total de S/.56.00 fue realizado con éxito.")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .show();

    }


}
