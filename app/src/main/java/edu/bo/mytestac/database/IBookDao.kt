package edu.bo.mytestac.database

import androidx.room.*

@Dao
interface IBookDao {
    @Query("SELECT * FROM book_table")
    fun getList(): List<Book>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(book:Book)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun update(book: Book)



}