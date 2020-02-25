package inc.bizties.joga.features.home.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import inc.bizties.joga.R
import inc.bizties.joga.features.home.HomePact
import inc.bizties.joga.features.home.presenter.HomePresenter
import kotlinx.android.synthetic.main.home_view.*

class HomeFragment : Fragment(), HomePact.View {

    private val presenter: HomePact.Presenter = HomePresenter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return LayoutInflater.from(container?.context).inflate(R.layout.home_view, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        manageNoContent()

        swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light)

        swipeContainer.setOnRefreshListener { presenter.refresh() }

        fab.setOnClickListener { presenter.showPlayerDialog(context) }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        presenter.onAttach(this)
    }

    override fun onDetach() {
        super.onDetach()
        presenter.onDetach()
    }

    override fun manageNoContent() {
        tableHeader.visibility = View.GONE
        recyclerView.visibility = View.GONE
    }

    override fun hideProgress() {
        swipeContainer.isRefreshing = false
    }
}