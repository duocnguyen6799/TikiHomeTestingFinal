package com.npdstudio.tikihometesting.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class DataQuickLink {
    @SerializedName("data")
    @Expose
    private var data: List<List<QuickLink?>?>? = null

    fun getData(): List<List<QuickLink?>?>? {
        return data
    }

    fun setData(data: List<List<QuickLink?>?>?) {
        this.data = data
    }
}