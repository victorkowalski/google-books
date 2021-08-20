package com.victor.gbooks.ui.base

interface IBaseView<T> {
    fun attachPresenter(presenter: T)
    fun detachPresenter()
    fun showProgress()
    fun hideProgress()
}