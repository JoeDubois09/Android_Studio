package kr.co.smc.ex05

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.co.smc.ex05.databinding.ActivityMainBinding
import kr.co.smc.ex05.databinding.ActivitySecBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //var binding = ActivitySecBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text1.text = "안녕!! 게임!!"
        binding.text1.setBackgroundColor(Color.RED)

        binding.button1.setOnClickListener(listener1)
        binding.button2.setOnClickListener(listener1)
    }

    // 버튼을 클릭하면 호출되는 리스너 객체 생성
    val listener1 = View.OnClickListener {
        when (it.id) { // 사건이 발생한 객체의 주소값이 it 으로 들어옴
            binding.button1.id -> binding.text1.text = "첫 번째 버튼을 눌렀습니다."
            binding.button2.id -> binding.text1.text = "두 번째 버튼을 눌렀습니다."
        }
    }
}