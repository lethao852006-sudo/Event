package com.example.eventregister

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eventregister.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Khởi tạo ViewBinding
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Nhận dữ liệu từ Intent gửi sang từ MainActivity
        val hoTen = intent.getStringExtra("KEY_HOTEN")
        val mssv = intent.getStringExtra("KEY_MSSV")
        val email = intent.getStringExtra("KEY_EMAIL")
        val gioiTinh = intent.getStringExtra("KEY_GIOITINH")
        val mangXaHoi = intent.getStringExtra("KEY_MXH")

        // Hiển thị dữ liệu lên các TextView tương ứng
        binding.tvHoTen.text = "Họ và tên: $hoTen"
        binding.tvMSSV.text = "Mã sinh viên: $mssv"
        binding.tvEmail.text = "Email: $email"
        binding.tvGioiTinh.text = "Giới tính: $gioiTinh"
        binding.tvMangXaHoi.text = "Mạng xã hội: $mangXaHoi"
    }
}