package com.example.sampleapp.redux.action

sealed class UpdateTimeAction {
//this is the one example

    //that can i show




    data class UpdateMessage(val message: String) : UpdateTimeAction()
    object ClearMessage : UpdateTimeAction()

}