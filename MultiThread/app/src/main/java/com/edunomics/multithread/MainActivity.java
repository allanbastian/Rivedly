package com.edunomics.multithread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Username, Password;
    private String Name, Pass;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        Login = findViewById(R.id.login_button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = Username.getText().toString();
                Pass = Password.getText().toString();
                if (Name.isEmpty()) {
                    Username.setError("Required");
                    Username.requestFocus();
                } else if (Pass.isEmpty()) {
                    Password.setError("Required");
                    Password.requestFocus();
                } else {
                    if (Name.equals("admin") && Pass.equals("admin")) {
                        Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Username: admin, Password: admin", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
