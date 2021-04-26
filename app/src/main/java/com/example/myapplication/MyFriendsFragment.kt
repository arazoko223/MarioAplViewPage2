package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendfragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Michelle diego ", "Perempuan", "Michelle@gmail.com", "Mahasiswa",
                "Tulungagung")
        )
        listTeman.add(
            MyFriend("abygale gloria anastasya", "Perempuan", "gloria@gmail.com", "Mahasiswa",
                "Surabaya")
        )
        listTeman.add(
            MyFriend("maikel wiliam", "Laki - laki", "maikel@gmail.com", "Pelajar SMA",
                "Tulungagung")
        )
        listTeman.add(
            MyFriend("Arista sandra", "Perempuan", "arista@gmail.com", "Mahasiswa",
                "Tangerang")
        )
        listTeman.add(
            MyFriend(" Elyana", "Perempuan", "Elyana@gmail.com", "Single",
                "Tulungagung")
        )
        listTeman.add(
            MyFriend("Stefanus Yogi", "Laki - laki", "Yogi@gmail.com", "Pelajar SMA",
                "Sidoarjo")
        )
        listTeman.add(
            MyFriend("Ni Komang ayu", "Perempuan", "Nikomang@gmail.com", "Single",
                "Bali")
        )
        listTeman.add(
            MyFriend("Yohanes Vandi", "Laki - laki", "Yohanes@gmail.com", "Pegawai",
                "Surabaya")
        )
        listTeman.add(MyFriend("Dea claudia", "Perempuan", "claudia@gmail.com", "Mahasiswa",
            "Surabaya"))
        listTeman.add(
            MyFriend("Fifortune Agna", "Perempuan", "Fifortune@gmail.com", "Single",
                "Tulungagung")
        )
        listTeman.add(
            MyFriend("Faybie putri ratna sari", "Perempuan", "Fybie@gmail.com", "Mahasiswa",
                "Malang")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}