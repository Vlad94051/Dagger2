package ru.tms.dagger2.di

import dagger.Module
import dagger.Provides
import ru.tms.dagger2.models.User

@Module
class UserModule {

    @Provides
    fun providesUser(): User =
        User(
            name = "Name",
            age = 12
        )
}