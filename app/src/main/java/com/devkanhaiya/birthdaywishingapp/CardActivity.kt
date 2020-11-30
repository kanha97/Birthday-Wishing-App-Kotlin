package com.devkanhaiya.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devkanhaiya.birthdaywishingapp.MainActivity.Companion.NAME_EXTRA
import kotlinx.android.synthetic.main.activity_card.*

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val name = intent.getStringExtra(NAME_EXTRA)
        names.text = "Happy Birthday $name"
    }
}