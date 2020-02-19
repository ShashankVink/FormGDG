package com.example.formgdg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ChainHead;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button submitbtn;
    EditText emailET, nameET, collegeET,mobileET,linkET,facebookET,githubET,resumeET,VIPET,pastexpET,aboutET,namepersonET,otherET;
    Spinner qualificationSpn;
    RadioButton femaleRB,maleRB, otherRB;
    SeekBar ageSB;
    CheckBox checkbox,checkbox1,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6,checkbox7,checkbox8,checkbox9,checkbox10,checkbox11,checkbox12,checkbox13,checkbox14,checkbox15,checkbox16,checkbox17,checkbox18,checkbox19,checkbox20,checkbox21,checkbox22,checkbox23,checkbox24,checkbox25,checkbox26,checkbox27,checkbox28;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailET = (EditText) findViewById(R.id.emailET);
        nameET = (EditText) findViewById(R.id.nameET);
        collegeET = (EditText) findViewById(R.id.collegeET);
        mobileET = (EditText) findViewById(R.id.mobileET);
        linkET = (EditText) findViewById(R.id.linkET);
        facebookET = (EditText) findViewById(R.id.facebookET);
        githubET = (EditText) findViewById(R.id.githubET);
        resumeET = (EditText) findViewById(R.id.resumeET);
        VIPET = (EditText) findViewById(R.id.VIPET);
        pastexpET = (EditText) findViewById(R.id.pastexpET);
        aboutET = (EditText) findViewById(R.id.aboutET);
        namepersonET = (EditText) findViewById(R.id.namepersonET);
        otherET = (EditText) findViewById(R.id.otherET);
        submitbtn = (Button) findViewById(R.id.submitbtn);
        qualificationSpn = (Spinner) findViewById(R.id.qualificationSpn);
        femaleRB = (RadioButton) findViewById(R.id.femaleRB);
        maleRB = (RadioButton) findViewById(R.id.maleRB);
        otherRB = (RadioButton) findViewById(R.id.otherRB);
        ageSB = (SeekBar) findViewById(R.id.ageSB);
        checkbox = (CheckBox) findViewById(R.id.checkbox);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkbox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkbox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkbox9 = (CheckBox) findViewById(R.id.checkbox9);
        checkbox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkbox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkbox12 = (CheckBox) findViewById(R.id.checkbox12);
        checkbox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkbox14 = (CheckBox) findViewById(R.id.checkbox14);
        checkbox15 = (CheckBox) findViewById(R.id.checkbox15);
        checkbox16 = (CheckBox) findViewById(R.id.checkbox16);
        checkbox17 = (CheckBox) findViewById(R.id.checkbox17);
        checkbox18 = (CheckBox) findViewById(R.id.checkbox18);
        checkbox19 = (CheckBox) findViewById(R.id.checkbox19);
        checkbox20 = (CheckBox) findViewById(R.id.checkbox20);
        checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        checkbox25 = (CheckBox) findViewById(R.id.checkbox25);
        checkbox26 = (CheckBox) findViewById(R.id.checkbox26);
        checkbox27 = (CheckBox) findViewById(R.id.checkbox27);
        checkbox28 = (CheckBox) findViewById(R.id.checkbox28);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameET.getText().toString();
                String email = emailET.getText().toString();
                String college = collegeET.getText().toString();
                String mobile = mobileET.getText().toString();
                String link = linkET.getText().toString();
                String facebook = facebookET.getText().toString();
                String github = githubET.getText().toString();
                String resume = resumeET.getText().toString();
                String VIP = VIPET.getText().toString();
                String pastexp = pastexpET.getText().toString();
                String other = otherET.getText().toString();
                String nameperson = namepersonET.getText().toString();
                String about = aboutET.getText().toString();
                String occupation = null;
                if (femaleRB.isChecked()) {
                    occupation = "FEMALE";
                }
                if (maleRB.isChecked()) {
                    occupation = "MALE";
                }
                if (otherRB.isChecked()) {
                    occupation = "OTHER";
                }
                int age = ageSB.getProgress();
                boolean isAgree = checkbox28.isChecked();

                Feedback fb = new Feedback(name, email, college, mobile, link, facebook, github, resume, VIP, pastexp, other, nameperson, about, age, isAgree);
                Intent i = new Intent(MainActivity.this, ThankyouActivity.class);
                i.putExtra("feedback", fb);
                startActivity(i);
            }
        });

    }
}
