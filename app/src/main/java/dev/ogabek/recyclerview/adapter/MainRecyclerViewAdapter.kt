package dev.ogabek.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.ogabek.recyclerview.databinding.RvItemBinding
import dev.ogabek.recyclerview.model.User

class MainRecyclerViewAdapter(private var userList: ArrayList<User>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.setValue(userList[position])
        }
    }

    class MyViewHolder(private val binding: RvItemBinding) : ViewHolder(binding.root) {
        fun setValue(user: User) {
            binding.tvName.text = user.name
            binding.tvPhoneNumber.text = user.phoneNumber
        }
    }

    override fun getItemCount(): Int = userList.size
}