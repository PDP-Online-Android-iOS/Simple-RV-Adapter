package dev.ogabek.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.recyclerview.adapter.MainRecyclerViewAdapter
import dev.ogabek.recyclerview.databinding.ActivityMainBinding
import dev.ogabek.recyclerview.model.users

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.rvMain.adapter = MainRecyclerViewAdapter(users)

    }


}