package jp.techacademy.takayuk.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }
    }


    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->

                if (hour in 2..9 && minute >= 0) {
                    textView.setText("おはようございます")
                } else if(hour in 10..17 && minute >= 0) {
                    textView.setText("こんにちわ")
                } else 
                    textView.setText("こんばんは")

            },
            12, 0, true)
        timePickerDialog.show()
    }
}