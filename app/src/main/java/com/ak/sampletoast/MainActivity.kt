package com.ak.sampletoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ak.toastytoast.SuccessToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_click_here).setOnClickListener {
            SuccessToast.toast(this,"Hello world")
        }
    }
}