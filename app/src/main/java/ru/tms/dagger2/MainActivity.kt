package ru.tms.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import ru.tms.dagger2.models.User
import ru.tms.dagger2.presentation.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user: User

    @Inject
    lateinit var viewModel: MainViewModel

    init {
        DaggerApplication.appComponent?.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        viewModel.user.observe(this) { user ->
            Toast.makeText(this@MainActivity, user.name, Toast.LENGTH_LONG).show()
        }
        Log.e("!!!: ", user.name)
    }
}