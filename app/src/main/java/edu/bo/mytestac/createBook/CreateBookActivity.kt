package edu.bo.mytestac.createBook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton
import edu.bo.mytestac.BookListActivity
import edu.bo.mytestac.BookPresenter
import edu.bo.mytestac.IBookList
import edu.bo.mytestac.R
import edu.bo.mytestac.database.Book

class CreateBookActivity : AppCompatActivity(), ICreateBook.View {
    lateinit var presenter: ICreateBook.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.createbook)
        presenter = CreateBookPresenter(this, applicationContext)
        val buttonAddBook = findViewById<Button>(R.id.saveButton)
        buttonAddBook.setOnClickListener {
            var titulo = findViewById<EditText>(R.id.titleText)
            var pagina = findViewById<EditText>(R.id.editPaginas)
            var editorial = findViewById<EditText>(R.id.editorial)
            var autor = findViewById<EditText>(R.id.editAutor)
            var description = findViewById<EditText>(R.id.editDescription)
            var Urlimagen = findViewById<EditText>(R.id.editImage)

            presenter.AddBook(Book(titulo.text.toString(),pagina.text.toString(),editorial.text.toString(),autor.text.toString(),description.text.toString(),Urlimagen.text.toString()))
        }
    }

    override fun GotoListActivity() {
        val intent = Intent(this@CreateBookActivity,BookListActivity::class.java)
        startActivity(intent)
    }
}