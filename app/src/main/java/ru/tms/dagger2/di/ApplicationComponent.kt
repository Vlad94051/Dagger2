package ru.tms.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.tms.dagger2.MainActivity
import ru.tms.dagger2.presentation.MainViewModel

@Component(
    modules = [
        UserModule::class,
        DomainModule::class
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun bindContext(context: Context): Builder

        fun build(): ApplicationComponent
    }

    fun inject(target: MainActivity)
}