package com.example.recyclerviewadapter.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _nbItems: Int = 30
    val nbItems: Int
        get() = _nbItems

    private var _items: List<String> = List(30) { "item$it" }
    val items: List<String>
        get() = _items
}