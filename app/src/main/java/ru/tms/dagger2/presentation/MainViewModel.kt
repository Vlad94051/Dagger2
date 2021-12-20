package ru.tms.dagger2.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.tms.dagger2.domain.GetUserInteractor
import ru.tms.dagger2.models.User
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getUserInteractor: GetUserInteractor
) : ViewModel() {

    val user: LiveData<User> get() = _userLiveData
    private val _userLiveData = MutableLiveData<User>()

    init {
        _userLiveData.value = getUserInteractor.getUser()
    }
}