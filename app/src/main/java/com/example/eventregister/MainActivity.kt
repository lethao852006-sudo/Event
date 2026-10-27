package com.example.eventregister

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.eventregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        xuLyEditText()
        xuLyRadioButton()
        xuLyCheckBox()
        xuLyButton()
    }

    private fun xuLyEditText() {

        binding.edtHoTen.setOnFocusChangeListener { _, hasFocus ->

            if (hasFocus) {
                Toast.makeText(
                    this,
                    "Bạn đang nhập Họ và tên",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.edtMSSV.setOnFocusChangeListener { _, hasFocus ->

            if (hasFocus) {
                Toast.makeText(
                    this,
                    "Bạn đang nhập Mã sinh viên",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.edtEmail.setOnFocusChangeListener { _, hasFocus ->

            if (hasFocus) {
                Toast.makeText(
                    this,
                    "Bạn đang nhập Email",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    when (checkedId) {

        binding.rbNam.id -> {
            Toast.makeText(
                this,
                "Bạn đã chọn giới tính Nam",
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.rbNu.id -> {
            Toast.makeText(
                this,
                "Bạn đã chọn giới tính Nữ",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}   