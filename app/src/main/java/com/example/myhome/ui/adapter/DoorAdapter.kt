package com.example.myhome.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myhome.databinding.ItemDoorBinding
import com.example.myhome.exception.setImage
import com.example.myhome.models.camera.CamerasItem

class DoorAdapter : ListAdapter<CamerasItem, DoorAdapter.ViewHolder>(AnimeDiffCallBack) {

    inner class ViewHolder(private val binding: ItemDoorBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(it: CamerasItem) {
            binding.itemText.text = it.name
            binding.itemImage.setImage(it.snapshot)
            Log.e("room", it.room)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDoorBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    object AnimeDiffCallBack : DiffUtil.ItemCallback<CamerasItem>() {
        override fun areItemsTheSame(
            oldItem: CamerasItem,
            newItem: CamerasItem,
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: CamerasItem,
            newItem: CamerasItem,
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}