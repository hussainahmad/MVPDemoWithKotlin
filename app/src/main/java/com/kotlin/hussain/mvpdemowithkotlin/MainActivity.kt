/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin

import android.os.Bundle
import com.kotlin.hussain.mvpdemowithkotlin.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
