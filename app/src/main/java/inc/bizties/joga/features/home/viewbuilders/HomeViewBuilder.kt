package inc.bizties.joga.features.home.viewbuilders

import android.content.Context
import android.support.design.widget.FloatingActionButton
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import inc.bizties.joga.R
import inc.bizties.joga.features.home.HomePact


class HomeViewBuilder(context: Context, override val presenter: HomePact.Presenter) : HomePact.ViewBuilder {

    private var swipeContainer: SwipeRefreshLayout?
    private var recyclerView: RecyclerView
    private var tableHeader: View
    private var noContent: View

    override val view: View = LayoutInflater.from(context).inflate(R.layout.home_view, null)

    init {
        swipeContainer = view.findViewById(R.id.swipeContainer)
        recyclerView = view.findViewById(R.id.recyclerView)
        tableHeader = view.findViewById(R.id.table_header)
        noContent = view.findViewById(R.id.view_no_content)

        swipeContainer?.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light)

        swipeContainer?.setOnRefreshListener { presenter.refresh() }

        val fab: FloatingActionButton = view.findViewById(R.id.fab)
        fab.setOnClickListener { presenter.showPlayerDialog() }
    }

    override fun manageNoContent() {
        tableHeader.visibility = View.GONE
        recyclerView.visibility = View.GONE
    }

    override fun hideProgress() {
        swipeContainer?.isRefreshing = false
    }
}
