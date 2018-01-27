package com.kotlin.hussain.mvpdemowithkotlin

import android.os.Bundle
import com.kotlin.hussain.mvpdemowithkotlin.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
