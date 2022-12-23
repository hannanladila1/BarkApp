package com.example.barkapp.model

data class Puppies(
    val id: Int,
    val title : String,
    val sex: String,
    val age: Int,
    val description : String,
    val puppyImageId : Int = 0
)