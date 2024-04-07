package com.chen.main.ui.fragment.home

import android.os.Bundle
import com.chen.base.ext.setupFragment
import com.chen.base.fragment.BaseFragment
import com.chen.base.vm.BaseViewModel
import com.chen.main.R
import com.chen.main.databinding.FragmentHomeBinding

/**
 * Author: Chen
 * Email: 1563011912@qq.com
 * Create Date: 2024/3/26
 * Profile:
 */
class HomeFragment : BaseFragment<BaseViewModel, FragmentHomeBinding>() {

    override fun initView(savedInstanceState: Bundle?) {
        setupFragment(R.id.homeChildFragment, HomeChildFragment::class.java)
    }
}