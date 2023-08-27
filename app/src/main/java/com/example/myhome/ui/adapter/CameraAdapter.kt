package com.example.myhome.ui.adapter


import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myhome.databinding.ItemCameraBinding
import com.example.myhome.exception.setImage
import com.example.myhome.models.camera.CamerasItem

class CameraAdapter : ListAdapter<CamerasItem, CameraAdapter.ViewHolder>(AnimeDiffCallBack) {

    inner class ViewHolder(private val binding: ItemCameraBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(it: CamerasItem) {
            binding.itemText.text = it.name
            binding.itemImage.setImage(it.snapshot)
            Log.e("room", it.room)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCameraBinding.inflate(
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