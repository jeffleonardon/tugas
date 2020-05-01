package com.example.konsulstudent.User

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.konsulstudent.R
import kotlinx.android.synthetic.main.activity_signup.*


class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val status = ArrayList<String>()
        status.add("Mahasiswa")
        status.add("Dosen")
        val dataAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, status)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        comboStatus.setAdapter(dataAdapter)

        btnSignup.setOnClickListener{
            if(comboStatus.selectedItem.equals("Mahasiswa")){
                val i = Intent(this, com.example.konsulstudent.Mahasiswa.Profile.CreateProfileMhs::class.java)
                startActivity(i)
            }
            else{
                val i = Intent(this, com.example.konsulstudent.Dosen.Profile.CreateProfileDs::class.java)
                startActivity(i)
            }
        }
    }
}
