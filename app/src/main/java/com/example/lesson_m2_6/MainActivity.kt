package com.example.lesson_m2_6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardView = findViewById<CardView>(R.id.card_view)
        cardView.setBackgroundResource(R.drawable.bg_card_view)
        val buttonOne = findViewById<Button>(R.id.button_one)
        buttonOne.setOnClickListener { view: View? ->
            if (cardView.alpha == 1f) {
                cardView.animate().alpha(0f)
            } else {
                cardView.animate().alpha(1f)
            }
        }
        val bigButton = findViewById<Button>(R.id.big_button)
        val container = findViewById<LinearLayout>(R.id.container)
        bigButton.setOnClickListener { view: View? ->
            if (container.visibility == View.VISIBLE) {
                container.visibility = View.GONE
            } else {
                container.visibility = View.VISIBLE
            }
        }
        val btnCircle = findViewById<Button>(R.id.btn_circle)
        val editText = findViewById<EditText>(R.id.edit_text)
        btnCircle.setOnClickListener { view: View? ->
            Snackbar.make(
                findViewById<View>(R.id.constraint), editText.text.toString(),
                Snackbar.LENGTH_LONG
            ).setAction(
                "Закрыть"
            ) { view1: View? ->
                Toast.makeText(
                    this@MainActivity,
                    "Закрыто",
                    Toast.LENGTH_SHORT
                ).show()
            }.show()
        }
    }
}