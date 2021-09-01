package com.victor.gbooks.ui.main

import android.os.Bundle
import com.victor.gbooks.util.FragmentManager

class MainPresenter(private var mView: MainContract.View?): MainContract.Presenter {

    override fun onBackPressed() {
        mView?.let {
            if(FragmentManager.onBackPressed()) {
                it.finishActivity()
            }
        }
    }

    override fun onViewCreated(isRestored: Boolean) {
        mView?.let {
            FragmentManager.init(it.getMainFragmentManager(), it.getFragmentHolderId(), isRestored)
        }

    }

    override fun onDestroy() {
        mView = null
        FragmentManager.destroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {}
    override fun onRestoreInstanceState(savedState: Bundle) {}
}