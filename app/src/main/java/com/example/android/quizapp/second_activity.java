package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class second_activity extends AppCompatActivity {
    int score = 0;
    TextView ques_5_correct_ans;
    TextView ques_8_correct_ans;
    Button submit_button;
    Button finish;
    CheckBox que_1_op_1;
    CheckBox que_1_op_2;
    CheckBox que_1_op_3;
    CheckBox que_1_op_4;
    RadioGroup que_2_radioGroup;
    RadioButton que_2_op_1;
    RadioButton que_2_op_2;
    RadioButton que_2_op_3;
    RadioButton que_2_op_4;
    RadioGroup que_3_radioGroup;
    RadioButton que_3_op_1;
    RadioButton que_3_op_2;
    RadioButton que_3_op_3;
    RadioButton que_3_op_4;
    EditText que_5_ans;
    CheckBox que_4_op_1;
    CheckBox que_4_op_2;
    CheckBox que_4_op_3;
    CheckBox que_4_op_4;
    RadioGroup que_6_radioGroup;
    RadioButton que_6_op_1;
    RadioButton que_6_op_2;
    RadioButton que_6_op_3;
    RadioButton que_6_op_4;
    RadioGroup que_7_radioGroup;
    RadioButton que_7_op_1;
    RadioButton que_7_op_2;
    RadioButton que_7_op_3;
    RadioButton que_7_op_4;
    EditText que_8_ans;
    RadioGroup que_9_radioGroup;
    RadioButton que_9_op_1;
    RadioButton que_9_op_2;
    RadioButton que_9_op_3;
    RadioButton que_9_op_4;
    CheckBox que_10_op_1;
    CheckBox que_10_op_2;
    CheckBox que_10_op_3;
    CheckBox que_10_op_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        ques_5_correct_ans = (TextView) findViewById(R.id.que_5_correct_ans);
        ques_5_correct_ans.setVisibility(View.INVISIBLE);
        ques_8_correct_ans = (TextView) findViewById(R.id.que_8_correct_ans);
        ques_8_correct_ans.setVisibility(View.INVISIBLE);
        que_1_op_1 = (CheckBox) findViewById(R.id.question_1_option_1);
        que_1_op_2 = (CheckBox) findViewById(R.id.question_1_option_2);
        que_1_op_3 = (CheckBox) findViewById(R.id.question_1_option_3);
        que_1_op_4 = (CheckBox) findViewById(R.id.question_1_option_4);
        que_2_radioGroup = (RadioGroup) findViewById(R.id.question_2_radioGroup);
        que_2_op_1 = (RadioButton) findViewById(R.id.question_2_option_1);
        que_2_op_2 = (RadioButton) findViewById(R.id.question_2_option_2);
        que_2_op_3 = (RadioButton) findViewById(R.id.question_2_option_3);
        que_2_op_4 = (RadioButton) findViewById(R.id.question_2_option_4);
        que_3_radioGroup = (RadioGroup) findViewById(R.id.question_3_radioGroup);
        que_3_op_1 = (RadioButton) findViewById(R.id.question_3_option_1);
        que_3_op_2 = (RadioButton) findViewById(R.id.question_3_option_2);
        que_3_op_3 = (RadioButton) findViewById(R.id.question_3_option_3);
        que_3_op_4 = (RadioButton) findViewById(R.id.question_3_option_4);
        que_4_op_1 = (CheckBox) findViewById(R.id.question_4_option_1);
        que_4_op_2 = (CheckBox) findViewById(R.id.question_4_option_2);
        que_4_op_3 = (CheckBox) findViewById(R.id.question_4_option_3);
        que_4_op_4 = (CheckBox) findViewById(R.id.question_4_option_4);
        que_5_ans = (EditText) findViewById(R.id.question_5_answer);
        que_3_radioGroup = (RadioGroup) findViewById(R.id.question_3_radioGroup);
        que_6_radioGroup = (RadioGroup) findViewById(R.id.question_6_radioGroup);
        que_6_op_1 = (RadioButton) findViewById(R.id.question_6_option_1);
        que_6_op_2 = (RadioButton) findViewById(R.id.question_6_option_2);
        que_6_op_3 = (RadioButton) findViewById(R.id.question_6_option_3);
        que_6_op_4 = (RadioButton) findViewById(R.id.question_6_option_4);
        que_7_radioGroup = (RadioGroup) findViewById(R.id.question_7_radioGroup);
        que_7_op_1 = (RadioButton) findViewById(R.id.question_7_option_1);
        que_7_op_2 = (RadioButton) findViewById(R.id.question_7_option_2);
        que_7_op_3 = (RadioButton) findViewById(R.id.question_7_option_3);
        que_7_op_4 = (RadioButton) findViewById(R.id.question_7_option_4);
        que_8_ans = (EditText) findViewById(R.id.question_8_answer);
        que_9_radioGroup = (RadioGroup) findViewById(R.id.question_9_radioGroup);
        que_9_op_1 = (RadioButton) findViewById(R.id.question_9_option_1);
        que_9_op_2 = (RadioButton) findViewById(R.id.question_9_option_2);
        que_9_op_3 = (RadioButton) findViewById(R.id.question_9_option_3);
        que_9_op_4 = (RadioButton) findViewById(R.id.question_9_option_4);
        que_10_op_1 = (CheckBox) findViewById(R.id.question_10_option_1);
        que_10_op_2 = (CheckBox) findViewById(R.id.question_10_option_2);
        que_10_op_3 = (CheckBox) findViewById(R.id.question_10_option_3);
        que_10_op_4 = (CheckBox) findViewById(R.id.question_10_option_4);
        submit_button = (Button) findViewById(R.id.submit_button);
        finish = (Button) findViewById(R.id.finish_button);
        finish.setEnabled(false);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check_que_1_ans();
                check_que_2_ans();
                check_que_3_ans();
                check_que_4_ans();
                check_que_5_ans();
                check_que_6_ans();
                check_que_7_ans();
                check_que_8_ans();
                check_que_9_ans();
                check_que_10_ans();

                Toast.makeText(second_activity.this, "Score :" + score, Toast.LENGTH_SHORT).show();
                dialog();
                finish.setEnabled(true);
            }
        });
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(second_activity.this,
                        MainActivity.class);
                startActivity(myIntent);

            }
        });
    }

    public void dialog() {
        new AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.dialog_title))
                .setMessage((getResources().getString(R.string.dialog_content)) + score + "\n" + getResources().getString(R.string.ans_view_confirm))
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(second_activity.this, "Have a glance through the questions and their answers"
                                , Toast.LENGTH_SHORT).show();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent myIntent = new Intent(second_activity.this,
                                MainActivity.class);
                        startActivity(myIntent);
                    }

                }).create().show();

        submit_button.setEnabled(false);
    }

    private void check_que_1_ans() {
        if ((que_1_op_1.isChecked()) && (que_1_op_2.isChecked()) && (que_1_op_3.isChecked()) && !(que_1_op_4.isChecked())) {
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (que_1_op_1.isChecked()) {
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_1_op_2.isChecked()) {
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_1_op_3.isChecked()) {
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_1_op_4.isChecked()) {
            que_1_op_4.setBackgroundColor(getResources().getColor(R.color.red));
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else {
            que_1_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_1_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        }
        if (que_1_op_4.isChecked()) {
            que_1_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        }
    }

    private void check_que_2_ans() {
        int selectedId = que_2_radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.question_2_option_3) {
            que_2_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (selectedId == R.id.question_2_option_1) {
            que_2_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_2_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_2_option_2) {
            que_2_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_2_op_2.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_2_option_4) {
            que_2_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_2_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        } else {
            que_2_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }

    private void check_que_3_ans() {
        int selectedId = que_3_radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.question_3_option_4) {
            que_3_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (selectedId == R.id.question_3_option_2) {
            que_3_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            que_3_op_2.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_3_option_3) {
            que_3_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            que_3_op_3.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_3_option_1) {
            que_3_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            que_3_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        } else {
            que_3_op_4.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }

    private void check_que_4_ans() {
        if ((que_4_op_1.isChecked()) && (que_4_op_2.isChecked()) && (que_4_op_3.isChecked()) && !(que_4_op_4.isChecked())) {
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (que_4_op_1.isChecked()) {
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_4_op_2.isChecked()) {
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_4_op_3.isChecked()) {
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_4_op_4.isChecked()) {
            que_4_op_4.setBackgroundColor(getResources().getColor(R.color.red));
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        } else {
            que_4_op_1.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_4_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        }
        if (que_4_op_4.isChecked()) {
            que_4_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        }
    }

    private void check_que_5_ans() {
        String ans;
        ans = que_5_ans.getText().toString();
        if (ans.equals(getResources().getString(R.string.answer_5))) {
            que_5_ans.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else {
            que_5_ans.setBackgroundColor(getResources().getColor(R.color.red));
            ques_5_correct_ans.setVisibility(View.VISIBLE);
        }
    }

    private void check_que_6_ans() {
        int selectedId = que_6_radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.question_6_option_2) {
            que_6_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (selectedId == R.id.question_6_option_1) {
            que_6_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_6_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_6_option_3) {
            que_6_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_6_op_3.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_6_option_4) {
            que_6_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_6_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        } else {
            que_6_op_2.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }

    private void check_que_7_ans() {
        int selectedId = que_7_radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.question_7_option_3) {
            que_7_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (selectedId == R.id.question_7_option_1) {
            que_7_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_7_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_7_option_2) {
            que_7_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_7_op_2.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (selectedId == R.id.question_7_option_4) {
            que_7_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_7_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        } else {
            que_7_op_3.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }

    private void check_que_8_ans() {
        String ans;
        ans = que_8_ans.getText().toString();
        if (ans.equals(getResources().getString(R.string.answer_8))) {
            que_8_ans.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else {
            que_8_ans.setBackgroundColor(getResources().getColor(R.color.red));
            ques_8_correct_ans.setVisibility(View.VISIBLE);
        }
    }

    private void check_que_9_ans() {
        int selectedId = que_9_radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.question_9_option_2) {
            que_9_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        }
        if (selectedId == R.id.question_9_option_1) {
            que_9_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_9_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if (selectedId == R.id.question_9_option_3) {
            que_9_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_9_op_3.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if (selectedId == R.id.question_9_option_4) {
            que_9_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_9_op_4.setBackgroundColor(getResources().getColor(R.color.red));
        } else {
            que_9_op_2.setBackgroundColor(getResources().getColor(R.color.green));
        }
    }

    private void check_que_10_ans() {
        if ((que_10_op_2.isChecked()) && (que_10_op_3.isChecked()) && (que_10_op_4.isChecked()) && !(que_10_op_1.isChecked())) {
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            score += 5;
        } else if (que_10_op_2.isChecked()) {
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_10_op_3.isChecked()) {
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_10_op_4.isChecked()) {
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
        } else if (que_10_op_1.isChecked()) {
            que_10_op_1.setBackgroundColor(getResources().getColor(R.color.red));
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
        } else {
            que_10_op_2.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_3.setBackgroundColor(getResources().getColor(R.color.green));
            que_10_op_4.setBackgroundColor(getResources().getColor(R.color.green));
        }
        if (que_10_op_1.isChecked()) {
            que_10_op_1.setBackgroundColor(getResources().getColor(R.color.red));
        }
    }
}