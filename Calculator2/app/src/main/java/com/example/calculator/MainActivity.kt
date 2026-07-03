package com.example.calculator

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btn6: Button
    lateinit var btn5: Button
    lateinit var btn4: Button
    lateinit var btn3: Button
    lateinit var btn2: Button
    lateinit var btn1: Button
    lateinit var btn0: Button
    lateinit var btnDiv: Button
    lateinit var btnMultiply: Button
    lateinit var btnSubtract: Button
    lateinit var btnAdd: Button
    lateinit var btnCls: Button
    lateinit var btnDot: Button
    lateinit var btnPercent: Button
    lateinit var btnEquals: Button
    lateinit var btnBracket: Button
    lateinit var btnNegative: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnAdd = findViewById(R.id.btnPlus)
        btnCls = findViewById(R.id.btnClear)
        btnDot = findViewById(R.id.btnDot)
        btnEquals = findViewById(R.id.btnEquals)
        btnBracket = findViewById(R.id.btnBrackets)
        btn0 = findViewById(R.id.btnZero)
        btn1 = findViewById(R.id.btnOne)
        btn2 = findViewById(R.id.btnTwo)
        btn3 = findViewById(R.id.btnThree)
        btn4 = findViewById(R.id.btnFour)
        btn5 = findViewById(R.id.btnFive)
        btn6 = findViewById(R.id.btnSix)
        btn7 = findViewById(R.id.btnSeven)
        btn8 = findViewById(R.id.btnEight)
        btn9 = findViewById(R.id.btnNine)
        btnDiv = findViewById(R.id.btnDivide)
        btnSubtract = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnPercent = findViewById(R.id.btnPercent)
        btnNegative = findViewById(R.id.btnNegative)


        val display = findViewById<EditText>(R.id.etText)
        val btnBackspace = findViewById<ImageButton>(R.id.btnBack)

        //var firstNumber = 0.0
        //var operator = ""
        //var secondNumber = 0.0



        btn7.setOnClickListener { v ->
            display.append("7")
        }

        btn8.setOnClickListener { v ->
            display.append("8")
        }

        btn9.setOnClickListener { v ->
            display.append("9")
        }

        btn6.setOnClickListener { v ->
            display.append("6")
        }

        btn5.setOnClickListener { v ->
            display.append("5")
        }

        btn4.setOnClickListener { v ->
            display.append("4")
        }

        btn3.setOnClickListener { v ->
            display.append("3")
        }

        btn2.setOnClickListener { v ->
            display.append("2")
        }

        btn1.setOnClickListener { v ->
            display.append("1")
        }

        btn0.setOnClickListener { v ->
            display.append("0")
        }

        btnDot.setOnClickListener { v ->
            display.append(".")
        }

        btnNegative.setOnClickListener { v ->
            display.append("-")
        }

        btnBackspace.setOnClickListener { v ->
            if(display.text.isNotEmpty())
            {
                display.setText(display.text.toString().dropLast(1))
            }

        }

        btnPercent.setOnClickListener { v ->
            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()
            }

            display.append("%")
            /*else{
                firstNumber = display.text.toString().toDouble()
                display.append("%")
                operator = "%"
                var result = firstNumber / 100
                display.setText(result.toString())
            }*/

        }

        btnBracket.setOnClickListener { v ->
            if(display.text.isEmpty())
            {
                display.append("(")
            }
            else{
                display.append(")")
            }

        }

        btnMultiply.setOnClickListener { v ->

            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                display.append("*")
            }

            /*else{
                firstNumber = display.text.toString().toDouble()
                operator = "*"
                display.setText("")
            }*/
        }

        btnSubtract.setOnClickListener { v ->

            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                display.append("-")
            }

            /*else{
                firstNumber = display.text.toString().toDouble()
                operator = "-"
                display.setText("")
            }*/

        }

        btnAdd.setOnClickListener { v ->

            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                display.append("+")
            }

            /*else{
                firstNumber = display.text.toString().toDouble()
                operator = "+"
                display.setText("")
            }*/

        }

        btnDiv.setOnClickListener { v ->

            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                display.append("/")
            }

            /*else{
                firstNumber = display.text.toString().toDouble()
                operator = "/"
                display.setText("")
            }*/

        }

        btnEquals.setOnClickListener { v ->

            if(display.text.toString().isEmpty())
            {
                Toast.makeText(this,"Invalid format used.",
                    Toast.LENGTH_SHORT).show()

                return@setOnClickListener
            }
            else
            {
                //secondNumber = display.text.toString().toDouble()

                val expression = display.text.toString()

                try{
                    val result = ExpressionBuilder(expression).build().evaluate()

                    display.setText(result.toString())
                }catch(e: Exception)
                {
                    Toast.makeText(this,e.message,
                        Toast.LENGTH_SHORT).show()

                }
            }





            //display.append(firstNumber + operator + secondNumber)
            /*val result = when(operator){
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> firstNumber / secondNumber
                else -> 0.0
            }*/

            /*if(operator == "/" && secondNumber == 0.0)
            {
                Toast.makeText(this,"Cannot divide by zero",
                    Toast.LENGTH_SHORT).show()

                return@setOnClickListener
            }


            display.setText(result.toString())*/
        }

        btnCls.setOnClickListener { v ->
            display.setText("")
            /*operator = ""
            firstNumber = 0.0*/
        }


    }
}