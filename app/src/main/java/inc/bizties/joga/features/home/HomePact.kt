package inc.bizties.joga.features.home

import android.content.Context
import inc.bizties.joga.shared.base.BasePresenter
import inc.bizties.joga.shared.base.BaseView

interface HomePact {

    interface View : BaseView {

        fun manageNoContent()

        fun hideProgress()
    }

    interface Presenter : BasePresenter<HomePact.View> {

        fun showPlayerDialog(context: Context)

        fun refresh()
    }
}