package com.victor.gbooks.util

import androidx.fragment.app.Fragment
import com.victor.gbooks.ui.base.BaseFragment
import java.io.Serializable

object FragmentManager : FragmentManagerContract() {
    override fun addFragment(fragment: BaseFragment, tag: String?, inStack: Boolean?, addAndHide: Boolean?) {
        TODO("Not yet implemented")
    }

    override fun initRootFragment() {
        TODO("Not yet implemented")
    }

    override fun getHistory(): Array<ArrayList<String>> {
        TODO("Not yet implemented")
    }

    override fun setHistory(history: Serializable) {
        TODO("Not yet implemented")
    }

    override fun getActiveFragment(tabIndex: Int): Fragment? {
        TODO("Not yet implemented")
    }

    override fun onBackPressed(): Boolean {
        TODO("Not yet implemented")
    }

    override fun destroy() {
        TODO("Not yet implemented")
    }
}