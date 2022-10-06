package kr.co.smc.ex_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = Act

        textView1


        setContentView(R.layout.activity_main)


        test1.text="hi"

        TextView tx = findViewById(R.id.text1)
    }
}