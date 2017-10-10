package jp.tokushima.tatsuhama.toolbarbehaviorchange

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById(R.id.infoViewPager) as ViewPager
        viewPager.apply {
            adapter = object : FragmentPagerAdapter(supportFragmentManager) {
                override fun getCount(): Int = 2
                override fun getItem(position: Int): Fragment = when (position) {
                    0 -> HogeFragment()
                    1 -> HogeFragment()
                    else -> throw IllegalArgumentException()
                }

                override fun getPageTitle(position: Int): CharSequence = position.toString()
            }
        }
        (findViewById(R.id.infoViewTab) as TabLayout).setupWithViewPager(viewPager)
    }
}
