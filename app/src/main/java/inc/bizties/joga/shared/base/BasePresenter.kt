package inc.bizties.joga.shared.base

interface BasePresenter<in T : BaseView> {

    fun onAttach(view: T)

    fun onDetach()
}