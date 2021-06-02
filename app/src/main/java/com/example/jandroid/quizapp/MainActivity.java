package com.example.jandroid.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int correct=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkAnswer1(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question1_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question1_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    public void checkAnswer2(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question2_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question2_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==false &&isFalse==true){
            correct+=1;
        }
    }
    public void checkAnswer3(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question3_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question3_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    public void checkAnswer4(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question4_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question4_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    public void checkAnswer5(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question5_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question5_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==false &&isFalse==true){
            correct+=1;
        }
    }
    public void checkAnswer6(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question6_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question6_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==false &&isFalse==true){
            correct+=1;
        }
    }
    public void checkAnswer7(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question7_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question7_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==false &&isFalse==true){
            correct+=1;
        }
    }
    public void checkAnswer8(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question8_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question8_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    private void checkAnswer9(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question9_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question9_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    public void checkAnswer10(View view){
        CheckBox checkBoxTrue=(CheckBox) findViewById(R.id.question10_true);
        CheckBox checkBoxFalse=(CheckBox) findViewById(R.id.question10_false);
        boolean isTrue=checkBoxTrue.isChecked();
        boolean isFalse=checkBoxFalse.isChecked();
        if (isTrue==true &&isFalse==false){
            correct+=1;
        }
    }
    public void submitAnswers(View view){
        checkAnswer1(view);
        checkAnswer2(view);
        checkAnswer3(view);
        checkAnswer4(view);
        checkAnswer5(view);
        checkAnswer6(view);
        checkAnswer7(view);
        checkAnswer8(view);
        checkAnswer9(view);
        checkAnswer10(view);

        displayMessage();
    }
    public void displayMessage(){
        TextView textViewMessage=(TextView) findViewById(R.id.message_view);
        String newMessage;
        if (correct<3){
            newMessage = "Not so good. You only found "+correct+"/10 answers";
        }
        else if (correct<7){
            newMessage="You could have done better. You found "+correct+"/10 answers";
        }
        else if (correct<10){
            newMessage="You are almost there. You found " +correct+"/10 answers";
        }
        else{
            newMessage="Perfect. you found "+correct+"/10 answers";
        }
        textViewMessage.setText(newMessage);


    }

}