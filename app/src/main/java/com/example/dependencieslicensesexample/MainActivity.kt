package com.example.dependencieslicensesexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        license_btn.setOnClickListener {
            OssLicensesMenuActivity.setActivityTitle("Third-Party Licenses")
            startActivity(Intent(this, OssLicensesMenuActivity::class.java))
        }

    }
}

