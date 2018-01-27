package com.kotlin.hussain.mvpdemowithkotlin.base

import android.content.Context
import android.support.v4.app.Fragment
import android.view.inputmethod.InputMethodManager


/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 27-Jan-18.
 */
public abstract class BaseFragment: Fragment() {







    protected fun hideKeyboard() {
        if (activity != null) {
            val view = activity!!.currentFocus
            if (view != null) {
                val mKeyBoard = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                mKeyBoard.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }
    }

    protected fun showKeyboard() {
        if (activity != null) {
            val view = activity!!.currentFocus
            if (view != null) {
                val mKeyBoard = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                mKeyBoard.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
            }
        }
    }
}