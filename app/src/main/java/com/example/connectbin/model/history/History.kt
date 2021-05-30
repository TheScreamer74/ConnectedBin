package com.example.connectbin.model.history

data class History(
    val name: String,
    val packagingRecycle: List<String>,
    val packagingWaste: List<String>
)
