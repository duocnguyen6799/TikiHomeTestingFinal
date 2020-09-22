package com.npdstudio.tikihometesting.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class QuickLink {
    @SerializedName("title")
    @Expose
    val title: String? = null

    @SerializedName("content")
    @Expose
    val content: String? = null

    @SerializedName("url")
    @Expose
    val url: String? = null

    @SerializedName("authentication")
    @Expose
    val authentication: Boolean? = null

    @SerializedName("web_url")
    @Expose
    val webUrl: String? = null

    @SerializedName("image_url")
    @Expose
    val imageUrl: String? = null
}