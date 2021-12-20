package ru.tms.dagger2

import android.app.Application
import ru.tms.dagger2.di.ApplicationComponent
import ru.tms.dagger2.di.DaggerApplicationComponent

class DaggerApplication : Application() {

    companion object {
        var appComponent: ApplicationComponent? = null
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger()
    }

    private fun initDagger(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
            .bindContext(this@DaggerApplication)
            .build()
    }
}