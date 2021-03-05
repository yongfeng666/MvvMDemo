package com.myeblog.viewmodeltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.myeblog.viewmodeltest.databinding.ActivityMainBinding
import com.myeblog.viewmodeltest.viewModel.MainModel

class MainActivity : AppCompatActivity() {

    private lateinit var inflate: ActivityMainBinding

    private  val viewModel:MainModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inflate = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(inflate.root)

        inflate.button.setOnClickListener {
            viewModel.count++
            refresh()
        }
        refresh()

    }

    private fun refresh() {
        inflate.tv.text = viewModel.count.toString()
    }
}
