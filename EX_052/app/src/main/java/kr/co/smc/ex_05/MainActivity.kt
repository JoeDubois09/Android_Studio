package kr.co.smc.ex_05

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.co.smc.ex_05.databinding.ActivityMainBinding
import kr.co.smc.ex_05.databinding.ActivitySecBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //var binding = ActivitySecBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView1.text = "hi"
        binding.textView1.setTextColor(Color.BLUE)

        binding.button1.setOnClickListener(listener)
        binding.button2.setOnClickListener(listener)
    }

    var listener =  View.OnClickListener {
        when(it.id) {
            binding.button1.id -> binding.textView1.text = "홍길동"
            binding.button2.id -> binding.textView1.text = "게임소프트웨어과"
        }
    }


}