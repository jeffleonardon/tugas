package com.example.konsulstudent.Dosen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.konsulstudent.*
import kotlinx.android.synthetic.main.activity_dashboard_dosen.*

class DashboardDosen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_dosen)

        val drawerToggle:ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            dashboardds,
            toolbar,
            R.string.open,
            R.string.close
        ) {
            override fun onDrawerClosed(view: View) {
                super.onDrawerClosed(view)
                //toast("Drawer closed")
            }

            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
                //toast("Drawer opened")
            }
        }
        drawerToggle.isDrawerIndicatorEnabled = true
        dashboardds.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        val recyclercard :RecyclerView = findViewById(R.id.cardrecycler)
        val layoutmanager :RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclercard.layoutManager = layoutmanager
        val adapter = recyclercard.adapter
        recyclercard.adapter = adapter
    }
}
