package com.victor.gbooks.ui.search

import com.victor.gbooks.ui.base.IBasePresenter
import com.victor.gbooks.ui.base.IBaseView

interface SearchContract{
    interface Presenter: IBasePresenter {
        fun onViewCreated()
        fun addFragment()
    }

    interface View: IBaseView<Presenter> {
    }
}