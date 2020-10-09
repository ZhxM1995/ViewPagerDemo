package com.zhx.viewpagerdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * author: miaozhenxing662@hellobike.com
 * date: 2020/10/9
 * description:
 */
class PagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    private var dataList: ArrayList<Fragment>? = arrayListOf()

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return dataList?.get(position)!!
    }

    fun setData(data: ArrayList<Fragment>) {
        this.dataList = data
        notifyDataSetChanged()
    }
}