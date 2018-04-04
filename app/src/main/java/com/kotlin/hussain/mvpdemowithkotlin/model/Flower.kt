/*
 * MVP Demo With Kotlin
 * Copyright (c) 2018 TrueTechnology. This program is free software: you can redistribute it and/or modify it under the terms of the  Apache License Version 2.0, January 2004.
 */

package com.kotlin.hussain.mvpdemowithkotlin.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 4/4/2018.
 */
data class Flower(private val category: String, private val price: Double, private val instructions: String, private val photo: String,
                  private val name: String, private val productId: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readDouble(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(category)
        parcel.writeDouble(price)
        parcel.writeString(instructions)
        parcel.writeString(photo)
        parcel.writeString(name)
        parcel.writeString(productId)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "Flower(category='$category', price=$price, instructions='$instructions', photo='$photo', name='$name', productId='$productId')"
    }

    companion object CREATOR : Parcelable.Creator<Flower> {
        override fun createFromParcel(parcel: Parcel): Flower {
            return Flower(parcel)
        }

        override fun newArray(size: Int): Array<Flower?> {
            return arrayOfNulls(size)
        }
    }


}