package com.example.konsulstudent.Mahasiswa.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_create_profile_mhs.*

class CreateProfileMhs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile_mhs)

        val fakultas = ArrayList<String>()
        fakultas.add("Hukum")
        fakultas.add("Farmasi")
        fakultas.add("Bisnis dan Ekonomika")
        fakultas.add("Teknik")
        fakultas.add("Psikologi")
        fakultas.add("Bioteknologi")
        fakultas.add("Industri Kreatif")
        fakultas.add("Kedokteran")
        fakultas.add("Politeknik")
        val spin : Spinner = findViewById(R.id.comboFakultas)
        val fakadapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fakultas)
        fakadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        comboFakultas.setAdapter(fakadapter)

        val thnangkatan = ArrayList<String>()
        fakultas.add("2014")
        fakultas.add("2015")
        fakultas.add("2016")
        fakultas.add("2017")
        fakultas.add("2018")
        fakultas.add("2019")
        fakultas.add("2020")
        val spinn : Spinner = findViewById(R.id.comboThnAngkatan)
        val angkatanadapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, thnangkatan)
        angkatanadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        comboFakultas.setAdapter(angkatanadapter)

        btnConfirmMhs.setOnClickListener{
            val nama = iNamaMhs.text
            val nrp = iNrp.text
            val email = iEmailMhs.text
            val fak = comboFakultas.selectedItem.toString()
            val angkatan = comboThnAngkatan.selectedItem.toString()
        }
    }
}
