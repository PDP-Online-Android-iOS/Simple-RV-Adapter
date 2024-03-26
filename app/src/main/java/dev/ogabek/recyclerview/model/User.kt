package dev.ogabek.recyclerview.model

import java.util.UUID

data class User(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val phoneNumber: String
)

var users: ArrayList<User> = arrayListOf(

    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13"),
    User(name = "Ogabek", phoneNumber = "+998 93 203 73 13")

)
