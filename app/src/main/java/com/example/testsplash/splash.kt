package com.example.testsplash

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash.*

class splash : AppCompatActivity() {

    private var logo: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logo = findViewById(R.id.logo) as ImageView

        val animbg = sfondo.background as AnimationDrawable
        animbg.setEnterFadeDuration(10)
        animbg.setExitFadeDuration(5000)
        animbg.start()

        Handler().postDelayed({
            val i = Intent(this@splash, Login::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
            finish()
        }, animtimeout.toLong())

        val fgoanim = AnimationUtils.loadAnimation(this, R.anim.fgoanim)
        logo!!.startAnimation(fgoanim)
    }

    companion object {
        private val animtimeout = 5000
    }
}