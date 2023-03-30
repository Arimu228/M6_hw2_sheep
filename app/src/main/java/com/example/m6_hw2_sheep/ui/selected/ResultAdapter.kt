package com.example.m6_hw2_sheep.ui.selected

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.m6_hw2_sheep.databinding.ItemSelectedBinding

class ResultAdapter() : RecyclerView.Adapter<ResultAdapter.ResultViewHolder>() {

    private var imageList = arrayListOf<Uri>()

    inner class ResultViewHolder(private var binding: ItemSelectedBinding):ViewHolder(binding.root) {

        fun onBind(uri: Uri) {
            binding.imageSelectedRecycler.setImageURI(uri)
        }

    }

    @SuppressLint("NotifyDataSetChanged")
    fun addImage(mainImage: ArrayList<Uri>) {
        imageList = mainImage
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        return ResultViewHolder(
            ItemSelectedBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.onBind(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }


}