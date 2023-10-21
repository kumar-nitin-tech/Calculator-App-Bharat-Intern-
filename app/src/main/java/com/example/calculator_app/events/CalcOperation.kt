package com.example.calculator_app.events

sealed class CalcOperation( val symbol :  String){
    object Add: CalcOperation(symbol = "+")
    object Subtract: CalcOperation(symbol = "-")
    object Multiply: CalcOperation(symbol = "x")
    object Divide: CalcOperation(symbol = "/")
}
