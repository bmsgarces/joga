package inc.bizties.joga.features.home

import inc.bizties.joga.shared.viewbuilders.BaseViewBuilder

interface HomePact {

    interface ViewBuilder : BaseViewBuilder<Presenter> {

        fun manageNoContent()

        fun hideProgress()
    }

    interface Presenter {

        fun showPlayerDialog()

        fun refresh()
    }
}