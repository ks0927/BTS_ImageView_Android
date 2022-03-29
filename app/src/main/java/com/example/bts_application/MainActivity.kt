package com.example.bts_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.iv_bts1)
        image1.setOnClickListener{
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity1::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.iv_bts2)
        image2.setOnClickListener{
            Toast.makeText(this,"2번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity2::class.java)
            startActivity(intent)
        }
        val image3 = findViewById<ImageView>(R.id.iv_bts3)
        image3.setOnClickListener{
            Toast.makeText(this,"3번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity3::class.java)
            startActivity(intent)
        }
        val image4 = findViewById<ImageView>(R.id.iv_bts4)
        image4.setOnClickListener{
            Toast.makeText(this,"4번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity4::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.iv_bts5)
        image5.setOnClickListener{
            Toast.makeText(this,"5번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity5::class.java)
            startActivity(intent)
        }
        val image6 = findViewById<ImageView>(R.id.iv_bts6)
        image6.setOnClickListener{
            Toast.makeText(this,"6번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity6::class.java)
            startActivity(intent)
        }
        val image7 = findViewById<ImageView>(R.id.iv_bts7)
        image7.setOnClickListener{
            Toast.makeText(this,"7번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, BtsActivity7::class.java)
            startActivity(intent)
        }

    }



}