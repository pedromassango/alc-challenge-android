package com.pedromassango.alcchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAboutALC(view: View) = startActivity( Intent(this, AboutALCActivity::class.java))

    fun onMyProfile(view: View?) = startActivity( Intent(this, MyProfileActivity::class.java))
}