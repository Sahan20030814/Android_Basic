package lk.airnet.android_basic.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import lk.airnet.android_basic.R;

public class MainActivity extends AppCompatActivity {
    private Button submitBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                submitBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    }
                });
            }

            public void showMessage() {
//                Toast.makeText(MainActivity.this,
//                        R.string.texting_message,
//                        Toast.LENGTH_LONG).show();

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Confirmation Message")
                        .setMessage(R.string.texting_message)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,
                                        R.string.texting_message,
                                        Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }
}