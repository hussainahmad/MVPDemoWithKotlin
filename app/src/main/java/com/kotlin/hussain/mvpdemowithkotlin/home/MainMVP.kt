/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin.home

/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 4/4/2018.
 */
interface MainMVP {

    fun showLoading();
    fun hideLoading();
    fun onError(error: Throwable)
}