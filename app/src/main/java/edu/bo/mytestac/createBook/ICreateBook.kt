package edu.bo.mytestac.createBook

import edu.bo.mytestac.database.Book

interface ICreateBook {
    interface View {
        fun GotoListActivity()
    }

    interface Presenter {
        fun AddBook(book:Book)

    }
}