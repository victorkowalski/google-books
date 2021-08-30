package com.victor.gbooks.util

import androidx.fragment.app.Fragment
import com.victor.gbooks.ui.base.BaseFragment
import java.io.Serializable

abstract class FragmentManagerContract {
    // fragment manager related
    abstract fun addFragment(fragment: BaseFragment, tag: String? = null, inStack: Boolean? = true, addAndHide: Boolean? = false)
    abstract fun initRootFragment()
    abstract fun getHistory(): Array<ArrayList<String>>
    abstract fun setHistory(history: Serializable)
    abstract fun getActiveFragment(tabIndex: Int): Fragment?
    abstract fun onBackPressed(): Boolean
    abstract fun destroy()
}