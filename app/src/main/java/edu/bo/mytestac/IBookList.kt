package edu.bo.mytestac

import androidx.recyclerview.widget.RecyclerView

interface IBookList {
    interface View {

    }

    interface Presenter {
        fun GotoBook(id: Long)
        fun showBooks(reciclerView: RecyclerView)
    }
}