package edu.bo.mytestac.createBook

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import edu.bo.mytestac.database.Book
import edu.bo.mytestac.database.BookRepository
import edu.bo.mytestac.database.DatabaseBook
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

class CreateBookPresenter(val view:ICreateBook.View, val context: Context):ICreateBook.Presenter{
    override fun AddBook(book: Book) {
        runBlocking(Dispatchers.IO){
            val bookDao = DatabaseBook.getDatabase(context).bookDato()
            val repository = BookRepository(bookDao)
            repository.insert(book)
        }

        view.GotoListActivity()

    }


}