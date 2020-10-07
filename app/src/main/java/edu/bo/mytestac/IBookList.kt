package edu.bo.mytestac

import androidx.recyclerview.widget.RecyclerView
import edu.bo.mytestac.database.Book

interface IBookList {
    interface View {
        fun GotoAddBook()
    }

    interface Presenter {
        fun GotoBook()
        fun showBooks(reciclerView: RecyclerView)
        fun EditBook(book:Book)

    }
}