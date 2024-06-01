package com.example.wishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    // adding a Wish to the table
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun AddAWish(wishEntity : Wish)

    // loads all the wishes from the table
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes() : Flow<List<Wish>>

    // updates wish from table
    @Update
    abstract suspend fun updateWish(wishEntity: Wish)

    // deletes a wish from table
    @Delete
    abstract suspend fun deleteWish(wishEntity: Wish)

    // gets a wish of particular id from the table
    @Query("Select * from `wish-table` where id=:id")
    abstract fun getAWishById(id : Long) : Flow<Wish>


}