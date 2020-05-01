package com.example.konsulstudent.Dosen.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_view_profile_ds.*

class ViewProfileDs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_profile_ds)

        btnEdit.setOnClickListener{
            val i = Intent(this, com.example.konsulstudent.Dosen.Profile.UpdateProfileDs::class.java)
            startActivity(i)
        }
    }
}
