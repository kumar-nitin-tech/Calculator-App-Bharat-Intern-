package com.example.calculator_app.events

sealed class CalcAction{
    //We have action entering the number, clearing the screen, deleting a number, decimal number, Operation on the number

    //Entering the number
    data class Number(val number: Int): CalcAction()
    object Clear: CalcAction()
    object Delete:CalcAction()
    object Decimal: CalcAction()
    data class Operation(val operation: CalcOperation): CalcAction()
    object Calculate: CalcAction()
}
