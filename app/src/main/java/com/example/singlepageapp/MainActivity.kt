package com.example.singlepageapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val character = arrayOf("Neco Arc", "Chopper", "Jake", "Kirby", "Pochita", "David Martinez")
    private val emotion = arrayOf("Happy", "Sad", "Normal", "Angry", "Silly")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, character)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, emotion)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        val b1 = findViewById<Button>(R.id.button)
        val emotionlist = findViewById<Spinner>(R.id.spinner2)
        val charlist = findViewById<Spinner>(R.id.spinner)

        emotionlist.adapter = adapter2
        emotionlist.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }

        charlist.adapter = adapter
        charlist.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {}
        }

        b1.setOnClickListener {
            val emotionPosition = emotionlist.selectedItemPosition
            val charPosition = charlist.selectedItemPosition
            var resultText = ""
            var imageResId = 0

            //Neco Arc
            if (emotionPosition == 0 && charPosition == 0) {
                resultText = "Here is a happy Neco Arc :D"
                imageResId = R.drawable.happy_neco_arc
            }
            if (emotionPosition == 1 && charPosition == 0) {
                resultText = "Here is a sad Neco Arc :("
                imageResId = R.drawable.sad_neco_arc
            }
            if (emotionPosition == 2 && charPosition == 0) {
                resultText = "Here is a normal Neco Arc :|"
                imageResId = R.drawable.calm_neco_arc
            }
            if (emotionPosition == 3 && charPosition == 0) {
                resultText = "Here is an angry Neco Arc >:("
                imageResId = R.drawable.angry_neco_arc
            }
            if (emotionPosition == 4 && charPosition == 0) {
                resultText = "Here is a silly Neco Arc :3"
                imageResId = R.drawable.silly_neco_arc
            }

            //Chopper
            if (emotionPosition == 0 && charPosition == 1) {
                resultText = "Here is a happy Chopper :D"
                imageResId = R.drawable.happy_chopper
            }
            if (emotionPosition == 1 && charPosition == 1) {
                resultText = "Here is a sad Chopper :("
                imageResId = R.drawable.sad_chopper
            }
            if (emotionPosition == 2 && charPosition == 1) {
                resultText = "Here is a normal Chopper :|"
                imageResId = R.drawable.calm_chopper
            }
            if (emotionPosition == 3 && charPosition == 1) {
                resultText = "Here is an angry Chopper >:("
                imageResId = R.drawable.angry_chopper
            }
            if (emotionPosition == 4 && charPosition == 1) {
                resultText = "Here is a silly Chopper :3"
                imageResId = R.drawable.silly_chopper
            }

            //Jake
            if (emotionPosition == 0 && charPosition == 2) {
                resultText = "Here is a happy Jake :D"
                imageResId = R.drawable.happy_jake
            }
            if (emotionPosition == 1 && charPosition == 2) {
                resultText = "Here is a sad Jake :("
                imageResId = R.drawable.sad_jake
            }
            if (emotionPosition == 2 && charPosition == 2) {
                resultText = "Here is a normal Jake :|"
                imageResId = R.drawable.calm_jake
            }
            if (emotionPosition == 3 && charPosition == 2) {
                resultText = "Here is an angry Jake >:("
                imageResId = R.drawable.angry_jake
            }
            if (emotionPosition == 4 && charPosition == 2) {
                resultText = "Here is a silly Jake :3"
                imageResId = R.drawable.silly_jake
            }

            //Kirby
            if (emotionPosition == 0 && charPosition == 3) {
                resultText = "Here is a happy Kirby :D"
                imageResId = R.drawable.happy_kirby
            }
            if (emotionPosition == 1 && charPosition == 3) {
                resultText = "Here is a sad Kirby :("
                imageResId = R.drawable.sad_kirby
            }
            if (emotionPosition == 2 && charPosition == 3) {
                resultText = "Here is a normal Kirby :|"
                imageResId = R.drawable.calm_kirby
            }
            if (emotionPosition == 3 && charPosition == 3) {
                resultText = "Here is an angry Kirby >:("
                imageResId = R.drawable.angry_kirby
            }
            if (emotionPosition == 4 && charPosition == 3) {
                resultText = "Here is a silly Kirby :3"
                imageResId = R.drawable.silly_kirby
            }

            //Pochita
            if (emotionPosition == 0 && charPosition == 4) {
                resultText = "Here is a happy Pochita :D"
                imageResId = R.drawable.happy_pochita
            }
            if (emotionPosition == 1 && charPosition == 4) {
                resultText = "Here is a sad Pochita :("
                imageResId = R.drawable.sad_pochita
            }
            if (emotionPosition == 2 && charPosition == 4) {
                resultText = "Here is a normal Pochita :|"
                imageResId = R.drawable.calm_pochita
            }
            if (emotionPosition == 3 && charPosition == 4) {
                resultText = "Here is an angry Pochita >:("
                imageResId = R.drawable.angry_pochita
            }
            if (emotionPosition == 4 && charPosition == 4) {
                resultText = "Here is a silly Pochita :3"
                imageResId = R.drawable.silly_pochita
            }

            //David Martinez
            if (emotionPosition == 0 && charPosition == 5) {
                resultText = "Here is a happy David Martinez :D"
                imageResId = R.drawable.happy_david
            }
            if (emotionPosition == 1 && charPosition == 5) {
                resultText = "Here is a sad David Martinez :("
                imageResId = R.drawable.sad_david
            }
            if (emotionPosition == 2 && charPosition == 5) {
                resultText = "Here is a normal David Martinez :|"
                imageResId = R.drawable.calm_david
            }
            if (emotionPosition == 3 && charPosition == 5) {
                resultText = "Here is an angry David Martinez >:("
                imageResId = R.drawable.angry_david
            }
            if (emotionPosition == 4 && charPosition == 5) {
                resultText = "Here is a silly David Martinez :3"
                imageResId = R.drawable.silly_david
            }

            showDialog(resultText, imageResId)
        }
    }


    private fun showDialog(resultText: String, imageResId: Int) {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup, null)
        val builder = AlertDialog.Builder(this).setView(dialogView)
        val dialog = builder.create()

        val resultTextView = dialogView.findViewById<TextView>(R.id.result)
        val characterPhoto = dialogView.findViewById<ImageView>(R.id.characterPhoto)
        val closeButton: Button = dialogView.findViewById(R.id.closeButton)

        resultTextView.text = resultText
        characterPhoto.setImageResource(imageResId)

        closeButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}