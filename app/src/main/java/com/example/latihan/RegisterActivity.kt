package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        etUsername= findViewById(R.id.edt_username)
        etPassword= findViewById(R.id.edt_password)
        etConfirmPass = findViewById(R.id.edt_confirmPass)

        val bundle = intent.extras
        if (bundle !=null){
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
            etConfirmPass.setText(bundle.getString("confirm password"))
        }

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register-> {

                val bundle= Bundle()
                bundle.putString("username",etUsername.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}