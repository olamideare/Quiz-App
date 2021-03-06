package com.olamide.quizappdetails.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.olamide.quizappdetails.Constants
import com.olamide.quizappdetails.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.resultHeaderText)
        val tvScore : TextView = findViewById(R.id.resultTvScore)
         val resultBtnFinish : Button = findViewById(R.id.resultBtnFinish)

             tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)


        tvScore.text = "You Scored $correctAnswers out of $totalQuestion"

        resultBtnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}