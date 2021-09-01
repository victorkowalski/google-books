package com.victor.gbooks.ui.search

import android.os.Bundle
import com.victor.gbooks.ui.base.BaseFragment
import com.victor.gbooks.util.FragmentManager

class SearchPresenter(var mView: SearchContract.View?) :
        SearchContract.Presenter {

    companion object{
        const val KEY_TITLE: String = "KEY_TITLE"
        var mFragmentCount = 0
        fun newInstance(args: Bundle? = null): BaseFragment {
            val fragment = SearchFragment()
            args?.let { fragment.arguments = it }
            return fragment
        }
    }

    override fun onViewCreated() {
    }

    override fun onDestroy() {
        mView = null
        mFragmentCount--
    }

    override fun addFragment() {
        /*mFragmentCount++
        val instance = newInstance(Bundle().also {
            it.putString(
                KEY_TITLE,
                "SearchFragment"
            )
        })
        FragmentManager.addFragment(instance)*/
    }

}