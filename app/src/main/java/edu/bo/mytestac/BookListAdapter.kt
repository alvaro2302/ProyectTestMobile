package edu.bo.mytestac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.bo.mytestac.database.Book
import kotlinx.android.synthetic.main.row_book.view.*

class BookListAdapter(val books:ArrayList<Book>, val context: Context):RecyclerView.Adapter<BookListAdapter.UserListViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_book, parent, false)
        return UserListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return books.count()

    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        val book = books.get(position)
        holder.itemView.textTitle.text = book.title
        holder.itemView.numberpages.text = book.page
        holder.itemView.textEditorial.text = book.editorial
        holder.itemView.textAuthor.text = book.author
        holder.itemView.textDescription.text = book.description


    }

    class UserListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}