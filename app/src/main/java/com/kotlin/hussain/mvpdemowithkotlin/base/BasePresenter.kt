package com.kotlin.hussain.mvpdemowithkotlin.base


/**
 * Created by Hussain Sherwani
 * hussain.ahmad5539@gmail.com
 * on 27-Jan-18.
 */
public class BasePresenter<T:MvpView>: Presenter<T>{

    private var mvpView: T? = null
//    protected var mNetworkFragment: NetworkFragment? = null

    override fun attachView(mvpView: T) {

        this.mvpView = mvpView
    }

    override fun deattachView() {
        mvpView = null
    }

    fun getMvpView(): T? {
        return mvpView
    }

    fun isViewAttached(): Boolean {
        return mvpView != null
    }

    fun checkViewAttach() {
        if (!isViewAttached()) {
            throw ViewNotAttachedException()
        }
    }

    class ViewNotAttachedException : RuntimeException("View Not Attached!")
}