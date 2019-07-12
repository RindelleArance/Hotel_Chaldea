package com.example.testsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast


class Login : AppCompatActivity() {

        lateinit var email: EditText
        lateinit var psw: EditText
        lateinit var accedi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email=findViewById(R.id.email)
        psw=findViewById(R.id.psw)
        accedi=findViewById(R.id.accedi)

        email.addTextChangedListener(loginTextWatcher)
        psw.addTextChangedListener(loginTextWatcher)

        accedi.setOnClickListener {
            val i = Intent(this@Login, Main2Activity::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
            finish()
        }

    }

    private val loginTextWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            val usernameInput = email.getText().toString().trim()
            val passwordInput = psw.getText().toString().trim()

            accedi.setEnabled(!usernameInput.isEmpty() && !passwordInput.isEmpty())
        }

        override fun afterTextChanged(s: Editable) {

        }
    }



}
