package com.victor.gbooks.util

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.victor.gbooks.R
import com.victor.gbooks.ui.base.BaseFragment
import com.victor.gbooks.ui.search.SearchPresenter
import java.io.Serializable

object FragmentManager : FragmentManagerContract() {

    private var mFragmentManager: FragmentManager? = null

    override fun init(fragmentManager: FragmentManager, containerId: Int, isRestored: Boolean) {

        mFragmentManager = fragmentManager
        if(!isRestored)
            initSearchFragment()
    }

    override fun replaceFragment(containerId: Int, fragment: BaseFragment, tag: String?) {
        mFragmentManager
                ?.beginTransaction()
                ?.replace(containerId, fragment, tag)
                ?.commit()
    }

    override fun initSearchFragment() {
        val searchFragment = SearchPresenter.newInstance(Bundle().also {
            it.putString(
                    SearchPresenter.KEY_TITLE, "Search")
        })

        replaceFragment(R.id.container_main, searchFragment, "search")
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