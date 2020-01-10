package com.example.pariwisatasolo.model

import com.google.gson.annotations.SerializedName

data class ResponsePariwisata(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)