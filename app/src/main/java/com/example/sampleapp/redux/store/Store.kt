package com.example.sampleapp.redux.store

import com.example.sampleapp.redux.action.UpdateTimeAction
import com.example.sampleapp.redux.reducer.Reducer
import com.example.sampleapp.redux.state.TimeStamp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class Store(initialState: TimeStamp, private val reducer:(TimeStamp, UpdateTimeAction) -> TimeStamp) {

    private val _state = MutableStateFlow<TimeStamp>(initialState)
    val state = _state.asStateFlow()

    fun dispatch(action: UpdateTimeAction){
        _state.value = reducer(_state.value,action)
    }

}