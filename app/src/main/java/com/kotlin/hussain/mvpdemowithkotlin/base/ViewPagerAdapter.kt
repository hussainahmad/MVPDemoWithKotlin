/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin.base

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 4/4/2018.
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String) {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun getItem(position: Int): Fragment? {

        when (position) {
//            0 -> return Portfolio()
//            1 -> return Screener()
        }
        return null
    }

    override fun getCount(): Int {
        return count
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "Flowers"
            1 -> return "WishList"
        }
        return null
    }

    companion object {
        private val count: Int = 2
    }
}