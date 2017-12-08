package inc.bizties.joga.shared.container

import android.support.v7.widget.Toolbar
import inc.bizties.joga.shared.viewbuilders.BaseViewBuilder

interface ContainerPact {

    interface ViewBuilder : BaseViewBuilder<Presenter> {

        val toolbar: Toolbar

        fun getContainerViewId(): Int
    }

    interface Presenter
}