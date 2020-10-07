package edu.bo.mytestac.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Book::class),version = 1,exportSchema = false)
abstract class DatabaseBook:RoomDatabase() {
    abstract fun bookDato():IBookDao

    companion object {
        private var INSTANCE: DatabaseBook? = null
        fun getDatabase(context: Context): DatabaseBook {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext, DatabaseBook::class.java, "db_books").build()
                INSTANCE = instance
                return instance
            }


        }
    }
}