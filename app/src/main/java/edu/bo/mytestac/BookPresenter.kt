package edu.bo.mytestac

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.bo.mytestac.database.Book
import edu.bo.mytestac.database.BookRepository
import edu.bo.mytestac.database.DatabaseBook
import kotlinx.coroutines.*

class BookPresenter(val view:IBookList.View, val context:Context):IBookList.Presenter {


    override fun GotoBook() {
        view.GotoAddBook()
    }

    override fun showBooks(reciclerView: RecyclerView) {



        var lista:List<Book>

        lista = runBlocking(Dispatchers.IO){
            val bookDao = DatabaseBook.getDatabase(context).bookDato()
            val repository = BookRepository(bookDao)
            repository.getListBooks()
        }


        val bookListAdapter = BookListAdapter(ArrayList(lista), context)
        reciclerView.adapter = bookListAdapter
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        reciclerView.layoutManager = linearLayoutManager


    }

    override fun EditBook(book: Book) {

    }


}