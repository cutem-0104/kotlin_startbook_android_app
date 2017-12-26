package sample.qiitaclient

import android.app.Application
import sample.qiitaclient.dagger.AppComponent
import sample.qiitaclient.dagger.DaggerAppComponent

/**
 * Created by cutem on 2017/12/27.
 */
class QiitaClientApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}