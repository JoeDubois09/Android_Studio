package kr.co.smc.ex03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(listener1)
    }


    val listener1 = object : View.OnClickListener{
        override  fun onClick(v:View?) {
            text1.text = "버튼이 눌러졌습니다."
        }
    }
}