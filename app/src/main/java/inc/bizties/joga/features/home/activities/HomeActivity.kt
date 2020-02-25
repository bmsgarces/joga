package inc.bizties.joga.features.home.activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import inc.bizties.joga.R
import inc.bizties.joga.features.home.fragments.HomeFragment
import kotlinx.android.synthetic.main.container_view.*

class HomeActivity : AppCompatActivity() {

    private var homeFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.container_view)
        setSupportActionBar(toolbar)

        if (homeFragment == null) {
            homeFragment = HomeFragment()

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container_view, homeFragment)
            transaction.commit()
        }
    }
}
