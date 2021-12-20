package ru.tms.dagger2.domain

import android.content.Context
import android.util.Log
import ru.tms.dagger2.models.User
import javax.inject.Inject

interface GetUserInteractor {
    fun getUser(): User
}

class GetUserInteractorImpl @Inject constructor(
    private val user: User,
    private val context: Context
) : GetUserInteractor {

    override fun getUser(): User {
        Log.e("!!!CONTEXT: ", context.packageName)
        return user
    }
}