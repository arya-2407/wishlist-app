package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,

    @ColumnInfo(name = "wish-title")
    val title : String = "",

    @ColumnInfo(name = "wish-desc")
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Fit Body" , description = "6 pack abs"),
        Wish(title = "World Tour", description = "Visit 5 continents"),
        Wish(title = "Read More", description = "Read 50 books this year"),
        Wish(title = "Learn Guitar", description = "Master basic chords"),
        Wish(title = "Skydiving Adventure", description = "Go skydiving in Dubai"),
        Wish(title = "Language Learning", description = "Become fluent in Spanish"),
        Wish(title = "Volunteer", description = "Help at a local charity"),
        Wish(title = "Cooking Skills", description = "Learn to cook Italian cuisine"),
        Wish(title = "Gardening", description = "Grow a vegetable garden"),
        Wish(title = "Photography", description = "Take a photography course")
    )
}