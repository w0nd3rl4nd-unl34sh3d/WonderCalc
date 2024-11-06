package com.w0nd3rl4nd.wondercalc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init numbers
        val btnZero = findViewById<Button>(R.id.btnZero)
        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)
        val btnFive = findViewById<Button>(R.id.btnFive)
        val btnSix = findViewById<Button>(R.id.btnSix)
        val btnSeven = findViewById<Button>(R.id.btnSeven)
        val btnEight = findViewById<Button>(R.id.btnEight)
        val btnNine = findViewById<Button>(R.id.btnNine)

        //Init symbols
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnEqual = findViewById<Button>(R.id.btnEqual)
        val btnSum = findViewById<Button>(R.id.btnPlus)
        val btnMinus = findViewById<Button>(R.id.btnMinus)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnSymbol = findViewById<Button>(R.id.btnSign)
        val btnAC = findViewById<Button>(R.id.btnAC)

        //Init screen
        val screen = findViewById<TextView>(R.id.tvCalculator)

        //Init vars
        val stringBuilder = StringBuilder()

        //Init calc
        val calc: VisualCalculator = VisualCalculator(this, screen, stringBuilder)

        //Set onClickListeners
        //Writable

        //TODO("CLEANUP LISTENERS WITH A LOOP")

        btnZero.setOnClickListener {
            calc.appendNumberToExpression("0")
        }

        btnOne.setOnClickListener {
            calc.appendNumberToExpression("1")
        }

        btnTwo.setOnClickListener {
            calc.appendNumberToExpression("2")
        }

        btnThree.setOnClickListener {
            calc.appendNumberToExpression("3")
        }

        btnFour.setOnClickListener {
            calc.appendNumberToExpression("4")
        }

        btnFive.setOnClickListener {
            calc.appendNumberToExpression("5")
        }

        btnSix.setOnClickListener {
            calc.appendNumberToExpression("6")
        }

        btnSeven.setOnClickListener {
            calc.appendNumberToExpression("7")
        }

        btnEight.setOnClickListener {
            calc.appendNumberToExpression("8")
        }

        btnNine.setOnClickListener {
            calc.appendNumberToExpression("9")
        }

        btnSum.setOnClickListener {
            TODO("Gotta decide what to do with this")
        }

        btnMinus.setOnClickListener {
            TODO("Gotta decide what to do with this")
        }

        btnMultiply.setOnClickListener {
            TODO("Gotta decide what to do with this")
        }

        btnDivide.setOnClickListener {
            TODO("Gotta decide what to do with this")
        }

        btnDot.setOnClickListener {
            TODO("CHANGE THIS FOR A BACKSPACE")
        }

        //Specials

        btnAC.setOnClickListener  {
            calc.clearScreen()
        }

        btnEqual.setOnClickListener {
            TODO("Gotta decide what to do with this")
        }

    }
}