package inc.bizties.joga.features.home.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import inc.bizties.joga.R
import inc.bizties.joga.features.home.HomePact
import inc.bizties.joga.features.home.viewbuilders.HomeViewBuilder

class HomeFragment : Fragment(), HomePact.Presenter {

    private lateinit var viewBuilder: HomeViewBuilder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        viewBuilder = HomeViewBuilder(context, this)

        return viewBuilder.view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBuilder.manageNoContent()
    }

    override fun showPlayerDialog() {
        val builder = AlertDialog.Builder(activity)
        val layout = activity.layoutInflater.inflate(R.layout.dialog_player_view, null)
        builder.setView(layout)
        builder.create().show()
    }

    override fun refresh() {
        viewBuilder.hideProgress()
    }
}