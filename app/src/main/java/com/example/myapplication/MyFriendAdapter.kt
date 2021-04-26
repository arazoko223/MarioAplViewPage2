package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friend_item.*

class MyFriendAdapter (private val context: Context, private val items: ArrayList<MyFriend>):
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_friend_item, parent, false)
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }

    class ViewHolder(override val containerView:View):
        RecyclerView.ViewHolder(containerView), LayoutContainer{
        fun bindItem(item:MyFriend){
            txtFriendName.text=item.nama
            txtFriendJkel.text=item.jkel
            txtFriendEmail.text=item.email
            txtStatusTeman.text=item.status
            txtFriendAlamat.text=item.alamat
        }
    }
}