package com.example.sumGenerator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView n1;
    TextView n2;
    TextView n3;
    TextView ans;
    EditText editNo1;
    EditText editNo2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        ans = findViewById(R.id.ans);
        editNo1 = findViewById(R.id.editNo1);
        editNo2 = findViewById(R.id.editNo2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(editNo1.getText().toString()) + Integer.parseInt(editNo2.getText().toString());
                Toast.makeText(MainActivity.this, "Designed By Akhil Tiwari", Toast.LENGTH_SHORT).show();
                ans.setText("The sum is : "+ sum);
            }
        });
    }
}