package com.example.eventregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eventregister.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hoTen = intent.getStringExtra("hoTen")
        val mssv = intent.getStringExtra("mssv")
        val email = intent.getStringExtra("email")
        val gioiTinh = intent.getStringExtra("gioiTinh")
        val mangXaHoi = intent.getStringExtra("mangXaHoi")

        binding.tvHoTen.text = "Họ và tên: $hoTen"
        binding.tvMSSV.text = "Mã sinh viên: $mssv"
        binding.tvEmail.text = "Email: $email"
        binding.tvGioiTinh.text = "Giới tính: $gioiTinh"
        binding.tvMangXaHoi.text = "Mạng xã hội: $mangXaHoi"
    }
}