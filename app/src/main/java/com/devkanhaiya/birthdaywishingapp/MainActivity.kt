package com.devkanhaiya.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {

        val intent = Intent(this,CardActivity::class.java)

        val name = enterName.editableText.toString()
        intent.putExtra(NAME_EXTRA,name)
        startActivity(intent)
    }
}