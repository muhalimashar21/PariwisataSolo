package com.example.pariwisatasolo.model

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("tempatwisata")
	val tempatwisata: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("gambar")
	val gambar: String? = null
)