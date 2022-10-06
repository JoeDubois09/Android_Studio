package kr.co.smc.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kr.co.smc.aswitch.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.switch1.isChecked == true) {
                binding.textView.text = "ON 상태입니다."
            } else {
                binding.textView.text = "OFF 상태입니다."
            }
        }

        binding.button2.setOnClickListener {
            binding.switch2.isChecked = true
        }

        binding.button3.setOnClickListener {
            binding.switch2.isChecked = false
        }

        binding.switch1.setOnCheckedChangeListener(listener1)

        binding.switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked == true) {
                binding.textView2.text = "두 번째 스위치가 ON 상태가 되었습니다."
            } else {
                binding.textView2.text = "두 번째 스위치가 OFF 상태가 되었습니다."
            }
        }
    }

    val listener1 = object : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            when (buttonView?.id){
                binding.switch1.id -> {
                    if (isChecked == true) {
                        binding.textView.text = "첫 번째 스위치가 ON 상태가 되었습니다."
                    } else {
                        binding.textView.text = "첫 번째 스위치가 OFF 상태가 되었습니다."
                    }
                }
            }
        }
    }
}