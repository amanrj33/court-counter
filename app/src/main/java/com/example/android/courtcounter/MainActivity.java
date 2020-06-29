package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void addThreeForTeamA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void addTwoForTeamA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void addOneForTeamA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void addThreeForTeamB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void addTwoForTeamB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void addOneForTeamB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void displayForTeamA(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        scoreA=scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);

    }
}
