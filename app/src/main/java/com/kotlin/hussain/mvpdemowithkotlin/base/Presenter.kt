package com.kotlin.hussain.mvpdemowithkotlin.base

/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 27-Jan-18.
 */
interface Presenter<V : MvpView> {
    fun attachView(mvpView: V)
    fun deattachView()
}