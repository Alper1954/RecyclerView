package com.example.recyclerviewadapter.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var numNewItem:Int=0

    private var _items: MutableList<String> = MutableList(30) { "item$it" }
    val items: List<String>
        get() = _items


}