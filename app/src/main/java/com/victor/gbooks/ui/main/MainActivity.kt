package com.victor.gbooks.ui.main

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.victor.gbooks.R
import com.victor.gbooks.ui.base.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {

    private var mPresenter: MainContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        attachPresenter(MainPresenter(this))
        mPresenter?.onViewCreated(savedInstanceState != null)
    }

    override fun getFragmentHolderId(): Int = R.id.container_main

    override fun getMainFragmentManager(): FragmentManager = supportFragmentManager

    override fun finishActivity() {
        finish()
    }

    override fun attachPresenter(presenter: MainContract.Presenter) {
        mPresenter = presenter
    }

    override fun detachPresenter() {
        mPresenter?.onDestroy()
        mPresenter = null
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }
}