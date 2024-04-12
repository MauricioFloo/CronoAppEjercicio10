package com.mexiti.cronoapp.state

import android.widget.Button

data class CronoState(
    val cronometroActivo: Boolean=false,
    val showSaveButton:Boolean=false,
    val showTextField:Boolean=false,
    val title:String=""
)
