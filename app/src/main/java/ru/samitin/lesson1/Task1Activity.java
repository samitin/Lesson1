package ru.samitin.lesson1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Task1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.button);
        EditText editText=findViewById(R.id.editText);
        Switch aSwitch=findViewById(R.id.switch1);
        CheckBox checkBox=findViewById(R.id.checkBox);
        ToggleButton toggleButton=findViewById(R.id.toggleButton);
        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void onClick(View view) {

                textView.setText(editText.getText().toString());
                if (aSwitch.isChecked())
                    textView.setTypeface(Typeface.create(textView.getTypeface(),800,checkBox.isChecked()));
                else
                    textView.setTypeface(Typeface.create(textView.getTypeface(),400,checkBox.isChecked()));
               if(toggleButton.isChecked())
                   textView.setTextColor(Color.RED);
               else
                   textView.setTextColor(Color.GREEN);
            }
        });
    }
}