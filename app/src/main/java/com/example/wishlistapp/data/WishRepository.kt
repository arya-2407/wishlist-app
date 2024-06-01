package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository (private val wishDao: WishDao) {

    suspend fun addAWish(wish: Wish){
        wishDao.AddAWish(wish)
    }

    fun getWishes() : Flow<List<Wish>> = wishDao.getAllWishes()

    fun getWishById(id:Long) : Flow<Wish>{
        return wishDao.getAWishById(id)
    }

    suspend fun updateAWish(wish: Wish){
        wishDao.updateWish(wish)
    }

    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteWish(wish)
    }


}