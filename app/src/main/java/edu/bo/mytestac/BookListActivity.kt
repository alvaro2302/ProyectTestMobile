package edu.bo.mytestac
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import edu.bo.mytestac.createBook.CreateBookActivity
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

        val buttonAdd = findViewById<FloatingActionButton>(R.id.floatingActionAdd)
        buttonAdd.setOnClickListener {
            presenter.GotoBook()
        }



    }

    override fun GotoAddBook() {
        val intent = Intent(this@BookListActivity,CreateBookActivity::class.java)
        startActivity(intent)
    }


}