package com.example.sampleapp.redux.action

sealed class UpdateTimeAction {
//this is the one example

    //that cal




    data class UpdateMessage(val message: String) : UpdateTimeAction()
    object ClearMessage : UpdateTimeAction()

}