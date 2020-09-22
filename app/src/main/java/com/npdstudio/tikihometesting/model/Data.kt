package com.npdstudio.tikihometesting.model

import com.google.gson.annotations.SerializedName


class Data<T>{
    @SerializedName("data")
    var list: List<T?>? = null

    fun get_List(): List<T?>? {
        return list
    }

}