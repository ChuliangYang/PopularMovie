package com.kotlin.goods.injection.component

import com.kotlin.base.injection.PerComponentScope
import com.kotlin.base.injection.component.ActivityComponent
import com.kotlin.goods.injection.module.CartModule
import com.kotlin.goods.injection.module.CategoryModule
import com.kotlin.goods.injection.module.GoodsModule
import com.kotlin.goods.ui.activity.GoodsActivity
import com.kotlin.goods.ui.fragment.CategoryFragment
import com.kotlin.goods.ui.fragment.GoodsDetailTabOneFragment
import dagger.Component

@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(GoodsModule::class,CartModule::class))
interface GoodsComponent {
    fun inject(activity: GoodsActivity)
    fun inject(fragment: GoodsDetailTabOneFragment)
}
