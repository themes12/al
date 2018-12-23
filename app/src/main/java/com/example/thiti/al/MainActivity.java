package com.example.thiti.al;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    TextView score, question;
    ImageView image;
    Random r;
    private Question mQuestion = new Question();
    private String mAnswer;
    private int mScore = 0;
    private Question images = new Question();
    private int mQuestionLenght = mQuestion.mQuestion.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        score = (TextView) findViewById(R.id.Score);
        question = (TextView) findViewById(R.id.textQuestion);

        image = (ImageView) findViewById(R.id.imageView);

        updateQuestion(r.nextInt(mQuestionLenght));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num) {
        question.setText(mQuestion.getQuestion(num));
        btn1.setText(mQuestion.getChoice1(num));
        btn2.setText(mQuestion.getChoice2(num));
        btn3.setText(mQuestion.getChoice3(num));
        btn4.setText(mQuestion.getChoice4(num));
        image.setImageResource(images.getImage(num));

        mAnswer = mQuestion.getCorrectAnser(num);
    }

    public void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game over " + mScore)
                .setCancelable(false)
                .setPositiveButton("Restart",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
