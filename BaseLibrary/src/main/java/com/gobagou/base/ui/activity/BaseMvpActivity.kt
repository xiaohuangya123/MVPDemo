package com.gobagou.base.ui.activity

import com.gobagou.base.presenter.BasePresenter
import com.gobagou.base.presenter.view.BaseView

/**
 * Author: Created by XHJ on 2019/2/9.
 * 种一棵树最好的时间是十年前，其次是现在。
 */
open class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(), BaseView{

    lateinit var mPresenter: T

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}