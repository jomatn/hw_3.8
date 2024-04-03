package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.databinding.CardItemBinding

class ListAdapter(
    private var charList: ArrayList<Card>,
    val onClick: (card: Card) -> Unit
) : Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(charList[position])
    }

    override fun getItemCount(): Int {
        return charList.size
    }

    class ViewHolder(private val binding: CardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Card) {
            binding.tvName.text = item.name
            binding.tvStatus.text = item.status
            //здесь должен был быть Glide но у меня он тупо не скачался
//           itemView.setOnClickListener { onClick.invoke(item) }
        }
    }
}
