package com.example.sampleapp.redux.action

sealed class UpdateTimeAction {

    data class UpdateMessage(val message: String) : UpdateTimeAction()
    object ClearMessage : UpdateTimeAction()

}