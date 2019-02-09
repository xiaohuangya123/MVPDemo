package com.gobagou.user.ui.activity

import android.os.Bundle
import com.gobagou.base.ui.activity.BaseMvpActivity
import com.gobagou.user.R
import com.gobagou.user.presenter.RegisterPresenter
import com.gobagou.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegisterBtn.setOnClickListener {
            mPresenter.register("18910229999","123456")
        }
    }

    override fun onRegisterResult(result: String) {
        toast(result)
    }
}
