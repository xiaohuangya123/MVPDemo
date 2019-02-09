package com.gobagou.user.presenter

import com.gobagou.base.presenter.BasePresenter
import com.gobagou.user.presenter.view.RegisterView

/**
 * Author: Created by XHJ on 2019/2/9.
 * 种一棵树最好的时间是十年前，其次是现在。
 */
class RegisterPresenter: BasePresenter<RegisterView>() {
    fun register(mobile:String, pwd:String){
        /*
        业务逻辑
         */
        mView.onRegisterResult("注册成功")
    }
}