package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class HomeScreen : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        tv= findViewById(R.id.textView2)
        val username: String? = intent.getParcelableExtra<User>("User")?.username
        val password: String? = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $username and Password: $password"

        val btnImplicit:Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_implicit->{
//                val message = "Halo Dava"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plan"
//                startActivity(intent)

                val intent= Intent()
                intent.putExtra("history", "anda sudah melakukan login")
                setResult(RESULT_OK,intent)
                finish()
            }
        }
    }
}