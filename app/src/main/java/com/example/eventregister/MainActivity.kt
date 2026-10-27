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

    when (checkedId)
    {

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
private fun xuLyCheckBox() {

    binding.cbFacebook.setOnCheckedChangeListener { _, isChecked ->

        if (isChecked) {
            Toast.makeText(
                this,
                "Đã chọn Facebook",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                this,
                "Đã bỏ chọn Facebook",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    binding.cbInstagram.setOnCheckedChangeListener { _, isChecked ->

        if (isChecked) {
            Toast.makeText(
                this,
                "Đã chọn Instagram",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                this,
                "Đã bỏ chọn Instagram",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    binding.cbTikTok.setOnCheckedChangeListener { _, isChecked ->

        if (isChecked) {
            Toast.makeText(
                this,
                "Đã chọn TikTok",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            Toast.makeText(
                this,
                "Đã bỏ chọn TikTok",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
    private fun xuLyButton() {

        binding.btnDangKy.setOnClickListener {

            val hoTen = binding.edtHoTen.text.toString().trim()

            val mssv = binding.edtMSSV.text.toString().trim()

            val email = binding.edtEmail.text.toString().trim()

            val gioiTinh =
                when (binding.rgGioiTinh.checkedRadioButtonId) {

                    binding.rbNam.id -> "Nam"

                    binding.rbNu.id -> "Nữ"

                    else -> "Chưa chọn"
                }

            val mangXaHoi = mutableListOf<String>()

            if (binding.cbFacebook.isChecked) {
                mangXaHoi.add("Facebook")
            }

            if (binding.cbInstagram.isChecked) {
                mangXaHoi.add("Instagram")
            }

            if (binding.cbTikTok.isChecked) {
                mangXaHoi.add("TikTok")
            }

            val danhSachMangXaHoi =
                if (mangXaHoi.isEmpty()) {
                    "Không chọn"
                } else {
                    mangXaHoi.joinToString(", ")
                }

            Toast.makeText(
                this,
                "Đang xử lý đăng ký...",
                Toast.LENGTH_SHORT
            ).show()
        }
    }