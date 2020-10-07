package edu.bo.mytestac.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book(
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name="pages") var page:String,
    @ColumnInfo(name="editorial") var editorial:String,
    @ColumnInfo(name="author") var author:String,
    @ColumnInfo(name="description") var description:String,
    @ColumnInfo(name="photoUrl") var photoUrl:String)
{
    @PrimaryKey(autoGenerate = true)
    var id:Long=0
}