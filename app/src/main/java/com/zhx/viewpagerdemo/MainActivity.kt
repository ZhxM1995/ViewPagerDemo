package com.zhx.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.gyf.immersionbar.ImmersionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val pageSize = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImmersionBar.with(this).init()
        initViewPager()
    }

    private fun initViewPager() {
        val fragments = mutableListOf<Fragment>()
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        for (i in 0 until pageSize) {
            val fm = FirstFragment()
            fm.callback = {
                pager.setCurrentItem(i+1,true)
            }
            fragments.add(fm)

        }
//        fragments.add(firstFragment)
        fragments.add(secondFragment)
        val adapter = PagerAdapter(this)
        adapter.setData(ArrayList(fragments))
        pager.adapter = adapter
    }
}