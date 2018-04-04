/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin.communication

import com.kotlin.hussain.mvpdemowithkotlin.model.Flower
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 4/4/2018.
 */
interface ServiceCall {

    @GET(Constants.END_POINT)
    fun hitCountCheck():
            Observable<Flower>

}