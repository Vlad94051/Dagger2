package ru.tms.dagger2.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.tms.dagger2.domain.GetUserInteractor
import ru.tms.dagger2.domain.GetUserInteractorImpl
import ru.tms.dagger2.models.User


@Module
class DomainModule {

    @Provides
    fun providesGetUserInteractor(
        user: User,
        context: Context
    ): GetUserInteractor =
        GetUserInteractorImpl(
            user = user,
            context = context
        )
}