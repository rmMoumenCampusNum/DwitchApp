package com.example.dwitchapp.model

data class Ingredient(
    val id: Long? = null,
    val documentID: String? = null,
    val name: String? = null,
    val description: String? = null,
    val isVegan: Boolean? = null,
    val isSpicy: Boolean? = null,
    val kind: String? = null,
)