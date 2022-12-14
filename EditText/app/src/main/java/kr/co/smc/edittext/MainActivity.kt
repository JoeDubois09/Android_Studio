package kr.co.smc.edittext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import kr.co.smc.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            binding.textView1.text = binding.editText1.text

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(binding.editText1.windowToken, 0)

            binding.editText1.clearFocus()
        }

        binding.editText1.addTextChangedListener(listener1)

        binding.editText1.setOnEditorActionListener { v, actionId, keyEvent ->
            binding.textView1.text ="Enter 버튼을 눌렀습니다."
            binding.textView2.text = binding.editText1.text
            false
        }
    }

    val listener1 = object : TextWatcher {
        //문자열이 변경되기 전
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            binding.textView1.text = "before : $s"
        }

        //문자열 변경 작업이 완료되었을 때
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            binding.textView2.text = "changed : $s"
        }

        //변경된 문자열이 화면에 반영되었을 때
        override fun afterTextChanged(s: Editable?) {
            binding.textView3.text = "after : $s"
        }
    }
}