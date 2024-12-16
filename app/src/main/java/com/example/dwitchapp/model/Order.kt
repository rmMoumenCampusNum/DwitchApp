package com.example.dwitchapp.model

data class Order(
    val id: Long? = null,
    val documentID: String? = null,
    val placedAt: String? = null,
    val cookMessage: String? = null,
    val price: Long? = null,
    val progress: Long? = null,
    val ingredients: List<Ingredient>? = null,
    val usersPermissionsUser: UsersPermissionsUser? = null,
    val store: Store? = null
)