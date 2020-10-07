package edu.bo.mytestac

import androidx.recyclerview.widget.RecyclerView

interface IBookList {
    interface View {
        fun GotoAddBook()
    }

    interface Presenter {
        fun GotoBook()
        fun showBooks(reciclerView: RecyclerView)

    }
}