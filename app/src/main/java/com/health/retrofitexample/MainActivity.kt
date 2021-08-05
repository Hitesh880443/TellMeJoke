package com.health.retrofitexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)
        setUpViewModel()
        setUpView()
    }

    private fun setUpView() {
        button.setOnClickListener {
            viewModel.getJokeFromServer()
        }

        viewModel.joke.observe(this, { joke ->
            joke?.let {
                tv_joke.text = it.setup
                tv_punch_line.text = it.punchline
            }
        })
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProvider(this, ViewModelFactory()).get(MainViewModel::class.java)
    }
}