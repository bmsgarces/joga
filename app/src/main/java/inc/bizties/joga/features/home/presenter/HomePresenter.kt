package inc.bizties.joga.features.home.presenter

import android.content.Context
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import inc.bizties.joga.R
import inc.bizties.joga.features.home.HomePact


class HomePresenter : HomePact.Presenter {

    private lateinit var view: HomePact.View

    override fun onAttach(view: HomePact.View) {
        this.view = view
    }

    override fun onDetach() {}

    override fun showPlayerDialog(context: Context) {
        val builder = AlertDialog.Builder(context)
        val layout = LayoutInflater.from(context).inflate(R.layout.dialog_player_view, null)
        builder.setView(layout)
        builder.create().show()
    }

    override fun refresh() {
        view.hideProgress()
    }
}
