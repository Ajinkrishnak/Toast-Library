package com.ak.sampletoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ak.toastytoast.ui.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_success).setOnClickListener {
            Toasty.success(this@MainActivity, "success_message", Toasty.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btn_error).setOnClickListener {
            Toasty.error(this@MainActivity, "error", Toasty.LENGTH_SHORT).show()
         }

        findViewById<Button>(R.id.btn_warning).setOnClickListener {
            Toasty.warning(this@MainActivity, "warning", Toasty.LENGTH_SHORT).show()
        }
    }
}