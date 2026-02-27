package com.example.sampleapp.redux.action

sealed class UpdateTimeAction {

    //hello guys
    data class UpdateMessage(val message: String) : UpdateTimeAction()
    object ClearMessage : UpdateTimeAction()

}