package com.edu.cecar.labcinco

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Views
    lateinit var radioGroup: RadioGroup;
    lateinit var checkBoxOnions: CheckBox;
    lateinit var checkBoxOlives: CheckBox;
    lateinit var checkBoxTomatoes: CheckBox
    lateinit var editTextComments: EditText
    lateinit var buttonPlaceHolder: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //views
        setupviews()
        //Agregar escucha al boton
        buttonPlaceHolder.setOnClickListener(View.OnClickListener {
                placeOrder(it)
        })


    }
    private fun setupviews(){
        radioGroup = findViewById(R.id.radioGroupSize)
        checkBoxOnions = findViewById(R.id.checkBoxOnions)
        checkBoxOlives = findViewById(R.id.checkBoxOlives)
        checkBoxTomatoes = findViewById(R.id.checkBoxtomatoes)
        editTextComments = findViewById(R.id.txtComments)
        buttonPlaceHolder = findViewById(R.id.butSave)
    }
    private fun placeOrder(it:View){
        val comments:String = txtComments.text.toString()
        val onions:Boolean = checkBoxOnions.isChecked
        val olives:Boolean = checkBoxOlives.isChecked
        val tomates:Boolean = checkBoxTomatoes.isChecked
        val pizzaSize:String = findViewById<RadioButton>(radioGroup.checkedRadioButtonId).text.toString()
        val cambioPantalla = Intent(this,InvoiceActivity::class.java)
        startActivity(cambioPantalla)

    }
}
