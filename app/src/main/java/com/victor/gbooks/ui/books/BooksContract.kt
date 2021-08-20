package com.victor.gbooks.ui.books

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.victor.gbooks.ui.base.IBasePresenter
import com.victor.gbooks.ui.base.IBaseView


interface BooksContract {
    interface Presenter: IBasePresenter {
        fun onViewCreated(isRestored: Boolean)
        fun onBackPressed()
        fun onSaveInstanceState(outState: Bundle)
        fun onRestoreInstanceState(savedInstanceState: Bundle)
    }

    interface View: IBaseView<Presenter> {
        fun getFragmentHolderId(): Int
        fun getMainFragmentManager(): FragmentManager
        fun getBottomNavigation(): BottomNavigationView
        fun finishActivity()
    }
}
