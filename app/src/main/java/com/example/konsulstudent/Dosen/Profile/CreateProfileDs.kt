package com.example.konsulstudent.Dosen.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_create_profile_ds.*

class CreateProfileDs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile_ds)

        btnConfirmMhs.setOnClickListener{
            val nama = iNamaMhs.text
            val npk = iNrp.text
            val email = iEmailDs.text
            //listMatkul = com.example.konsulstudent.Dosen.CreateMatkul
        }
    }
}
