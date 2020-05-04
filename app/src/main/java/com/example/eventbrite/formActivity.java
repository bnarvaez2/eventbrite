package com.example.eventbrite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class formActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Intent intent = getIntent();
    }

    public void principal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickShowAlert(final View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(formActivity.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Are you sure of left this screen?");
        myAlertBuilder.setPositiveButton("OK", new
            DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                    principal(view);
                }
            }
        );
        myAlertBuilder.setNegativeButton("Cancel", new
            DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // User cancelled the dialog.
                    Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                }
            }
        );
        myAlertBuilder.show();
    }

    public void showAlertSend_Mensaje(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(formActivity.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Are you sure to send the report?");
        myAlertBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(), "Report sent.", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        myAlertBuilder.show();
    }
}
