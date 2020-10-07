package edu.bo.mytestac.database

class BookRepository(private val bookDao:IBookDao) {
    suspend fun insert(book:Book){
        bookDao.insert(book)
    }
    fun getListBooks():List<Book>{
        return bookDao.getList()
    }
    suspend fun update(book:Book){
        bookDao.update(book)
    }
}