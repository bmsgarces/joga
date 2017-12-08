package inc.bizties.joga.features.home.activities

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import inc.bizties.joga.features.home.fragments.HomeFragment
import inc.bizties.joga.shared.container.ContainerPact
import inc.bizties.joga.shared.container.ContainerViewBuilder

class HomeActivity : AppCompatActivity(), ContainerPact.Presenter {

    private lateinit var viewBuilder: ContainerPact.ViewBuilder
    private var homeFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBuilder = ContainerViewBuilder(this, this)

        setContentView(viewBuilder.view)
        setSupportActionBar(viewBuilder.toolbar)

        if (homeFragment == null) {
            homeFragment = HomeFragment()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(viewBuilder.getContainerViewId(), homeFragment)
            transaction.commit()
        }
    }
}
