package com.waewaee.viewpager.bottomnav

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.viewpager.R
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)
        var sharedPreference = getSharedPreferences("Waee", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()

        btnSave.setOnClickListener {
            editor.putString("Jiptoo", etText.text.toString())
            editor.apply()
            etText.text.clear()
        }

        btnShow.setOnClickListener {
            tvShow.text = sharedPreference.getString("Jiptoo", "PhaungPhaung")
        }

        btnClear.setOnClickListener {
            editor.clear().apply()
        }
    }
}