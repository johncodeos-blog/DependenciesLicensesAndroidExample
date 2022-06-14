package com.example.dependencieslicensesexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val licenseButton = findViewById<Button>(R.id.license_btn)
        licenseButton.setOnClickListener {
            OssLicensesMenuActivity.setActivityTitle("Third-Party Licenses")
            startActivity(Intent(this, OssLicensesMenuActivity::class.java))
        }

    }
}

