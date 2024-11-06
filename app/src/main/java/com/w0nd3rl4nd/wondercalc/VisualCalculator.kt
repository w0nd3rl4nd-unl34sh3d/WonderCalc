package com.w0nd3rl4nd.wondercalc

import android.content.Context
import android.widget.TextView
import android.widget.Toast

class VisualCalculator(private val context: Context, private val screen: TextView, private val expression: StringBuilder) {

    var shownValue: String = ""

    private fun updateScreen() {
        screen.text = expression.toString()
        TODO("UPDATE THIS TO MATCH CURR NUMBER NOT EXPR")
        TODO("ADD THE AUTO SIZE ADJUSTING")
    }

    fun appendSymbolToExpression(item: String) {
        TODO("If symbol empty shownValue append expr")
    }

    fun appendNumberToExpression(item: String) {
        TODO("If number then expression, shownvalue.")
        expression.append(item)
        updateScreen()
    }

    fun clearScreen() {
        screen.text = ""
        expression.setLength(0)
    }

    fun backspace() {
        TODO("Implement with the new backspace button")
    }

    fun calculate() {

    }

    //When press operand screen clear add new value
    // If press operand again calculate then clear for next value and
    // calc with prev one
    //Store the expression separately

    //function parse input that implements append if its not a symbol
    //if it is symbol fun parsesymbol appends to expr and renews curr screen text

}