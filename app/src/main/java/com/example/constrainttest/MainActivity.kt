package com.example.constrainttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Flow
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var maxElements = 1

        btnStart.setOnClickListener {
            flow.setMaxElementsWrap(maxElements++)

            if (maxElements >= 7) {
                maxElements = 1
            }
        }

        btnNone.setOnClickListener{
            flow.setWrapMode(Flow.WRAP_NONE)
        }

        btnAligned.setOnClickListener{
            flow.setWrapMode(Flow.WRAP_ALIGNED)
        }

        btnChain.setOnClickListener{
            flow.setWrapMode(Flow.WRAP_CHAIN)
        }
    }
}