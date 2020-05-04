package com.example.eventbrite;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contenidoActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        Intent intent = getIntent();
    }

    public void formulario(View view) {
        Intent intent = new Intent(this, formActivity.class);
        startActivity(intent);
    }

    public void messageFollow(View view) {
        //Log.d(LOG_TAG, "You press in follow button!");
        String msg = "You press in follow button!";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void messageImagen(View view) {
        String ms= view.getContentDescription().toString();
        String msg = "You press in "+ ms + " icon";
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}
