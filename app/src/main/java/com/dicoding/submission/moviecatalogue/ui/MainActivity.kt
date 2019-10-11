package com.dicoding.submission.moviecatalogue.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.adapter.MovieAdapter
import com.dicoding.submission.moviecatalogue.model.Movie
import com.dicoding.submission.moviecatalogue.model.MovieData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieAdapter: MovieAdapter

    private var listOfMovies = ArrayList<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieAdapter = MovieAdapter(this)
        list_view_movie.adapter = movieAdapter
        addItem()

        list_view_movie.onItemClickListener = AdapterView.OnItemClickListener{ _, _, position, _ ->
            Toast.makeText(this@MainActivity, listOfMovies[position].title, Toast.LENGTH_LONG).show()
        }
    }

    private fun addItem() {
        listOfMovies = MovieData.listOfMovie
        movieAdapter.movies = listOfMovies
    }
}
