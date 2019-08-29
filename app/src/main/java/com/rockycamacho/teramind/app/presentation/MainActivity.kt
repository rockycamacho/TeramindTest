package com.rockycamacho.teramind.app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import coil.api.load
import coil.transform.CircleCropTransformation
import com.rockycamacho.teramind.app.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(mainToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        photo.load("https://www.fakepersongenerator.com/Face/male/male20141083572616852.jpg") {
            crossfade(true)
            placeholder(R.color.default_photo_bg)
            transformations(CircleCropTransformation())
        }
        name.text = "Jack Doe"
        job_title.text = "Customer Sales Representative"

        view_pager.adapter = MainPagerAdapter(this, supportFragmentManager)
        tab_layout.setupWithViewPager(view_pager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == R.id.menu_date) {
            Toast.makeText(this, "Not yet implemented", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}
