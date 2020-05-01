package com.example.konsulstudent.User

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        btnSignin.setOnClickListener{
            //if status dosen masuk ke dashboard dosen
            val i = Intent(this, com.example.konsulstudent.Dosen.DashboardDosen::class.java)
            startActivity(i)
            //if status mahasiswa masuk ke dashboard mahasiswa
            val ii = Intent(this, com.example.konsulstudent.Mahasiswa.DashboardMahasiswa::class.java)
            //startActivity(i)
        }

        txtSignup.setOnClickListener{
            val i = Intent(this, com.example.konsulstudent.User.Signup::class.java)
            startActivity(i)
        }
    }
}
