package com.gobagou.base.presenter

import com.gobagou.base.presenter.view.BaseView

/**
 * Author: Created by XHJ on 2019/2/9.
 * 种一棵树最好的时间是十年前，其次是现在。
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView: T
}