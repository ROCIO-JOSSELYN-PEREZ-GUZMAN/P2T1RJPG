package com.example.p2t1rjpg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup ope;
    EditText n1;
    EditText n2;
    TextView resu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ope=findViewById(R.id.radioGroup);
        n1=findViewById(R.id.editText);
        n2=findViewById(R.id.editText2);
        resu=findViewById(R.id.textView6);
        ope.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(ope.getCheckedRadioButtonId()){
                    case 2131165280:
                        resu.setText(""+(Integer.parseInt(String.valueOf(n1.getText()))+Integer.parseInt(String.valueOf(n2.getText()))));
                        break;
                    case 2131165281:
                        resu.setText(""+(Integer.parseInt(String.valueOf(n1.getText()))-Integer.parseInt(String.valueOf(n2.getText()))));
                        break;
                    case 2131165282:
                        resu.setText(""+(Integer.parseInt(String.valueOf(n1.getText()))*Integer.parseInt(String.valueOf(n2.getText()))));
                        break;
                    case 2131165283:
                        resu.setText(""+(Integer.parseInt(String.valueOf(n1.getText()))/Integer.parseInt(String.valueOf(n2.getText()))));
                        break;
                        default:

                }

            }
        });
    }
}
