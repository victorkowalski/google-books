package com.victor.gbooks.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.victor.gbooks.R
import com.victor.gbooks.ui.base.BaseFragment

class SearchFragment: BaseFragment(), SearchContract.View {
    private var mPresenter: SearchContract.Presenter? = null

    private lateinit var mSearchView : View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mSearchView = inflater.inflate(R.layout.fragment_search, container, false)
        attachPresenter(SearchPresenter(this))
        return mSearchView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        detachPresenter()
        super.onDestroyView()
    }

    override fun attachPresenter(presenter: SearchContract.Presenter) {
        mPresenter = presenter
    }

    override fun detachPresenter() {
        mPresenter?.onDestroy()
        mPresenter = null
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

}