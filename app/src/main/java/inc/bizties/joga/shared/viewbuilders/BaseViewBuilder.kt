package inc.bizties.joga.shared.viewbuilders

import android.view.View

interface BaseViewBuilder<T> {

    val view: View

    val presenter: T
}