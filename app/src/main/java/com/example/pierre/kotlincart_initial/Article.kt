package com.example.pierre.kotlincart_initial

//Etape 1
data class Article(var prix: Int, val name: String, val type: Type)


enum class Type {
    Dvd, Livre
}



