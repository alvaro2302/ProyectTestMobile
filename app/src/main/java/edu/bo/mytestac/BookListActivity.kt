package edu.bo.mytestac
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import edu.bo.mytestac.database.Book
import edu.bo.mytestac.database.BookRepository
import edu.bo.mytestac.database.DatabaseBook
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class BookListActivity : AppCompatActivity(),IBookList.View {
    lateinit var presenter: IBookList.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)

        presenter = BookPresenter(this, applicationContext)
        val reciclerView = findViewById<RecyclerView>(R.id.recicler)
        presenter.showBooks(reciclerView)

    }


}