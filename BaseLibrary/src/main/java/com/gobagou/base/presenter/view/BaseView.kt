package com.gobagou.base.presenter.view

/**
 * Author: Created by XHJ on 2019/2/9.
 * 种一棵树最好的时间是十年前，其次是现在。
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}