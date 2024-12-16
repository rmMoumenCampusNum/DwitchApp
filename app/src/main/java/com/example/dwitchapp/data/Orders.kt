package com.example.dwitchapp.data

import com.example.dwitchapp.model.Ingredient
import com.example.dwitchapp.model.Order
import com.example.dwitchapp.model.Store
import com.example.dwitchapp.model.UsersPermissionsUser

val orderList = listOf(
    Order(
        id = 1,
        documentID = "DOC12345",
        placedAt = "2024-12-15T10:00:00",
        cookMessage = "Ready to serve",
        price = 1500,
        progress = 75,
        ingredients = listOf(
            Ingredient(name = "Tomato", isVegan = true, isSpicy = false, kind = "Vegetable"),
            Ingredient(name = "Cheese", isVegan = false, isSpicy = false, kind = "Dairy")
        ),
        usersPermissionsUser = UsersPermissionsUser(id = 1, username = "john_doe"),
        store = Store(id = 101, name = "Pizza Place")
    ),
    Order(
        id = 2,
        documentID = "DOC67890",
        placedAt = "2024-12-15T12:30:00",
        cookMessage = "In progress",
        price = 2000,
        progress = 50,
        ingredients = listOf(
            Ingredient(name = "Lettuce", isVegan = true, isSpicy = false, kind = "Vegetable"),
            Ingredient(name = "Chicken", isVegan = false, isSpicy = false, kind = "Meat")
        ),
        usersPermissionsUser = UsersPermissionsUser(id = 2, username = "alice_smith"),
        store = Store(id = 102, name = "Burger Joint")
    ),
    Order(
        id = 3,
        documentID = "DOC11223",
        placedAt = "2024-12-16T09:00:00",
        cookMessage = "Delayed due to high demand",
        price = 1200,
        progress = 30,
        ingredients = listOf(
            Ingredient(name = "Bacon", isVegan = false, isSpicy = false, kind = "Meat"),
            Ingredient(name = "Egg", isVegan = false, isSpicy = false, kind = "Dairy")
        ),
        usersPermissionsUser = UsersPermissionsUser(id = 3, username = "bob_jones"),
        store = Store(id = 103, name = "Breakfast Cafe")
    ),
    Order(
        id = 4,
        documentID = "DOC44556",
        placedAt = "2024-12-16T14:30:00",
        cookMessage = "Cooked and waiting for pickup",
        price = 1800,
        progress = 90,
        ingredients = listOf(
            Ingredient(name = "Avocado", isVegan = true, isSpicy = false, kind = "Fruit"),
            Ingredient(name = "Salmon", isVegan = false, isSpicy = false, kind = "Fish")
        ),
        usersPermissionsUser = UsersPermissionsUser(id = 4, username = "lucy_white"),
        store = Store(id = 104, name = "Sushi Spot")
    ),
    Order(
        id = 5,
        documentID = "DOC78901",
        placedAt = "2024-12-16T17:00:00",
        cookMessage = "Out of stock for some ingredients",
        price = 2500,
        progress = 40,
        ingredients = listOf(
            Ingredient(name = "Pasta", isVegan = true, isSpicy = false, kind = "Grain"),
            Ingredient(name = "Tomato sauce", isVegan = true, isSpicy = true, kind = "Sauce")
        ),
        usersPermissionsUser = UsersPermissionsUser(id = 5, username = "mark_lee"),
        store = Store(id = 105, name = "Italian Bistro")
    )
)