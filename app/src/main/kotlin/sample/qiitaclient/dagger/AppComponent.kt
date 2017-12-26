package sample.qiitaclient.dagger

import dagger.Component
import sample.qiitaclient.MainActivity
import javax.inject.Singleton

/**
 * Created by cutem on 2017/12/27.
 */
@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}