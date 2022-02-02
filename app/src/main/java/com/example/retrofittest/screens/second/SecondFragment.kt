package com.example.retrofittest.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittest.R
import com.example.retrofittest.screens.start.StartAdapter
import com.example.retrofittest.screens.start.StartViewModel


class SecondFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter : SecondAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = view.findViewById(R.id.recycler_view_second)
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getCashlessMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })
        return view
    }

}