package co.kr.smc.EX01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var myName = "홍길동"
            var myAge : Int
            myAge = 17

            Log.d("이름", "myName=$myName, myAge=$myAge")
        }
}