package com.example.wishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDAO: WishDAO) {
    suspend fun addAWish(wish: Wish){
        wishDAO.addWish(wish)
    }

    fun getAWish():Flow<List<Wish>> = wishDAO.getAllWishes()

    fun getAWishById(id:Long):Flow<Wish>{
        return wishDAO.getWishesById(id)
    }

    suspend fun updateAWish(wish: Wish){
        wishDAO.updateWish(wish)
    }

    suspend fun deleteAWish(wish: Wish){
        wishDAO.deleteWish(wish)
    }

}