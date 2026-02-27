package com.example.sampleapp.redux.reducer

import com.example.sampleapp.redux.action.UpdateTimeAction
import com.example.sampleapp.redux.state.TimeStamp
import java.sql.Time

fun Reducer(state: TimeStamp,action: UpdateTimeAction): TimeStamp{
    return when(action){
        is UpdateTimeAction.UpdateMessage -> state.copy(lastUpdated = System.currentTimeMillis())
        is UpdateTimeAction.ClearMessage -> state.copy(lastUpdated = null)
    }
}