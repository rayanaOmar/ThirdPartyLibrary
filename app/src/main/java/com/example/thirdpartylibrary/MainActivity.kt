package com.example.thirdpartylibrary

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)

    lateinit var downLode: Button
    lateinit var fail: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        downLode = findViewById(R.id.downlodeBtn)
        fail = findViewById(R.id.failBtn)

        downLode.setOnClickListener {
            downLode.backgroundTintList = getColorStateList(R.color.red)
            fail.backgroundTintList = getColorStateList(R.color.white)

            elastic_download_view.startIntro()
            elastic_download_view.setProgress(25F)
            elastic_download_view.success()
        }

        fail.setOnClickListener {
            downLode.backgroundTintList = getColorStateList(R.color.red)
            fail.backgroundTintList = getColorStateList(R.color.white)

            elastic_download_view.startIntro()
            elastic_download_view.setProgress(25F)
            elastic_download_view.success()
        }
    }
}