package com.mj.kotlin_action_day01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    var a : Int = 0
    var b : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        btn_execute.setOnClickListener(this)
    }

    private fun max(a: Int, b: Int) : Int = if(a>b) a else b


    override fun onClick(view: View) {

        when(view.id){

            R.id.btn_execute -> {

                a = Integer.parseInt(edit_a.text.toString())
                b = Integer.parseInt(edit_b.text.toString())

                txt_result.text = max(a,b).toString()
            }
        }
    }
}
