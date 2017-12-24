package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by cutem on 2017/12/24.
 */
fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById<T>(id)
}