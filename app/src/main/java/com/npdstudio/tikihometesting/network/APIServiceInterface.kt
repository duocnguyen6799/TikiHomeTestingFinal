package com.npdstudio.tikihometesting.network

import com.npdstudio.tikihometesting.model.Banner
import com.npdstudio.tikihometesting.model.Data
import com.npdstudio.tikihometesting.model.DataQuickLink
import retrofit2.Call
import retrofit2.http.GET

interface APIServiceInterface {
    //https://api.tiki.vn/shopping/v2/widgets/quick_link
    //https://api.tiki.vn/v2/home/banners/v2
    //https://api.tiki.vn/v2/widget/deals/hot
    @GET("/v2/home/banners/v2")
    open fun getAllBanner(): Call<Data<Banner?>?>?

    @GET("/shopping/v2/widgets/quick_link")
    open fun getQuickLink(): Call<DataQuickLink?>?
//
//    @GET("/v2/widget/deals/hot")
//    fun getDealsHot(): Call<HotSale?>?
}