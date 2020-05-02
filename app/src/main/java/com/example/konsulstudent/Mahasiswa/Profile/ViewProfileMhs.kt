package com.example.konsulstudent.Mahasiswa.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_view_profile_mhs.*

class ViewProfileMhs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_profile_mhs)

        btnEditMhs.setOnClickListener{
            val i = Intent(this, UpdateProfileMhs::class.java)
            startActivity(i)
        }
    }
}
