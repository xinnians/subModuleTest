package com.example.submoduletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun hideBottomNav() {
        TODO("Not yet implemented")
    }

    override fun showBottomNav() {
        TODO("Not yet implemented")
    }
}
