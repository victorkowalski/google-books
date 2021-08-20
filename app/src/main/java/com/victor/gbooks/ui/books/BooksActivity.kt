package com.victor.gbooks.ui.books

import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.victor.gbooks.ui.base.BaseActivity

class BooksActivity : BaseActivity(), BooksContract.View {
    override fun getFragmentHolderId(): Int {
        TODO("Not yet implemented")
    }

    override fun getMainFragmentManager(): FragmentManager {
        TODO("Not yet implemented")
    }

    override fun getBottomNavigation(): BottomNavigationView {
        TODO("Not yet implemented")
    }

    override fun finishActivity() {
        TODO("Not yet implemented")
    }

    override fun attachPresenter(presenter: BooksContract.Presenter) {
        TODO("Not yet implemented")
    }

    override fun detachPresenter() {
        TODO("Not yet implemented")
    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }
}