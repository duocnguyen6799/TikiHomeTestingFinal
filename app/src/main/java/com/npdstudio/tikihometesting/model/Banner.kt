package com.npdstudio.tikihometesting.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Banner {
    var id: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("content")
    @Expose
    var content: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("image_url")
    @Expose
    var image_url: String? = null

    @SerializedName("thumbnail_url")
    @Expose
    var thumbnail_url: String? = null

    @SerializedName("mobile_url")
    @Expose
    var mobile_url: String? = null

    @SerializedName("ratio")
    @Expose
    var ratio = 0f

    fun get_ImageURL(): String? {
        return image_url
    }
}