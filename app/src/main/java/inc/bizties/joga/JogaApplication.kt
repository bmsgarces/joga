package inc.bizties.joga

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class JogaApplication : Application() {

    companion object {

        private const val LOG_TAG = "JogaApplication"
    }

    lateinit var instance: JogaApplication

    init {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
    }
}