package edu.bo.mytestac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import edu.bo.mytestac.database.Book
import edu.bo.mytestac.database.BookRepository
import edu.bo.mytestac.database.DatabaseBook
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonGotoListBook = findViewById<Button>(R.id.goToListBook)
        buttonGotoListBook.setOnClickListener {
            val intent = Intent(this@MainActivity,BookListActivity::class.java)
            startActivity(intent)
        }


    }
}