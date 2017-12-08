package inc.bizties.joga.shared.container

import android.content.Context
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import inc.bizties.joga.R

class ContainerViewBuilder(context: Context, override val presenter: ContainerPact.Presenter) : ContainerPact.ViewBuilder {

    override val view: View = LayoutInflater.from(context).inflate(R.layout.container_view, null)

    override val toolbar: Toolbar
        get() = view.findViewById(R.id.toolbar)

    override fun getContainerViewId(): Int {
        return R.id.container_view
    }
}