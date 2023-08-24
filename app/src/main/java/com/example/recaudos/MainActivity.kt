package com.example.recaudos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    var txtfecha:EditText?=null
    var botonfecha:ImageButton?=null
    var dpfecha:DatePicker?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtfecha= findViewById(R.id.txtfecha)
        botonfecha = findViewById(R.id.botonfecha)
        dpfecha = findViewById(R.id.dpfecha)

        txtfecha?.setText(getFechaDatePicker())

        dpfecha?.setOnDateChangedListener{
            dpfecha,anho,mes,dia->
            txtfecha?.setText(getFechaDatePicker())
            dpfecha.visibility=View.GONE
        }

    }

    fun getFechaDatePicker():String{
        var dia = dpfecha?.dayOfMonth.toString().padStart(length = 2, padChar = '0')
        var mes = (dpfecha!!.month+1).toString().padStart(length = 2, padChar = '0')
        var anho = dpfecha?.year.toString().padStart(length = 4, padChar = '0')

        return  dia+"/"+mes+"/"+anho
    }

    fun mostrarcalendario(view: View){
        botonfecha?.visibility=View.VISIBLE
    }
}

https://www.youtube.com/watch?v=WJCy_1RDFbg&ab_channel=ProgramadorNovato