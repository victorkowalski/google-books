package com.victor.gbooks.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.victor.gbooks.ui.base.BaseFragment
import java.io.Serializable

abstract class FragmentManagerContract {

    abstract fun init(fragmentManager: FragmentManager, containerId: Int, isRestored: Boolean)

    abstract fun replaceFragment(containerId: Int, fragment: BaseFragment, tag: String? = null)
    abstract fun initSearchFragment()
    abstract fun getHistory(): Array<ArrayList<String>>
    abstract fun setHistory(history: Serializable)
    abstract fun getActiveFragment(tabIndex: Int): Fragment?
    abstract fun onBackPressed(): Boolean
    abstract fun destroy()
}