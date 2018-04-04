/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import org.jetbrains.annotations.Nullable


/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 27-Jan-18.
 */
public abstract class BaseActivity : AppCompatActivity() {

    protected val currentFragment: Fragment?
        get() {
            val supportFragmentManager = supportFragmentManager
            if (supportFragmentManager.backStackEntryCount > 0) {
                val fragmentTag = supportFragmentManager.getBackStackEntryAt(supportFragmentManager.backStackEntryCount - 1).name
                return supportFragmentManager
                        .findFragmentByTag(fragmentTag)
            } else {
                return null
            }
        }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

}
