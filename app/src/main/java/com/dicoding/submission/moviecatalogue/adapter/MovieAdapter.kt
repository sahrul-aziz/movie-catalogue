package com.dicoding.submission.moviecatalogue.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter internal constructor(private val context: Context) : BaseAdapter() {

    internal var movies = arrayListOf<Movie>()

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_movie, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val movie = getItem(position) as Movie
        viewHolder.bind(movie)
        return itemView
    }

    override fun getItem(i: Int): Any = movies[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = movies.size

    private inner class ViewHolder internal constructor(private val view: View) {

        internal fun bind(movie: Movie) {
            with(view) {
                Glide.with(context).load(movie.poster).into(image_movie)
                val titleAndYear = "${movie.title} (${movie.year})"
                tv_title.text = titleAndYear
                val score = "Score: ${movie.score}"
                tv_score.text = score

                var moreGenre = 0
                for ((index, genre) in movie.listOfGenre.withIndex()) {
                    when (index) {
                        0 -> {
                            tv_genre_1.text = genre
                            tv_genre_1.setBackgroundResource(getGenreTextViewStyle(genre))
                        }
                        1 -> {
                            tv_genre_2.text = genre
                            tv_genre_2.setBackgroundResource(getGenreTextViewStyle(genre))
                        }
                        2 -> {
                            tv_genre_3.text = genre
                            tv_genre_3.setBackgroundResource(getGenreTextViewStyle(genre))
                        }
                        movie.listOfGenre.lastIndex -> {
                            moreGenre++
                            val moreGenreString = "+$moreGenre more"
                            tv_genre_more.text = moreGenreString
                            tv_genre_more.setBackgroundResource(getGenreTextViewStyle(moreGenreString))
                        }
                        else -> moreGenre++
                    }
                }

                tv_overview.text = movie.overview
            }
        }

        private fun getGenreTextViewStyle(genre: String) : Int {
            return when(genre) {
                "Action" -> R.drawable.genre_action
                "Adventure" -> R.drawable.genre_adventure
                "Animation" -> R.drawable.genre_animation
                "Comedy" -> R.drawable.genre_comedy
                "Crime" -> R.drawable.genre_crime
                "Drama" -> R.drawable.genre_drama
                "Family" -> R.drawable.genre_family
                "Fantasy" -> R.drawable.genre_fantasy
                "Music" -> R.drawable.genre_music
                "Romance" -> R.drawable.genre_romance
                "Science Fiction" -> R.drawable.genre_science_fiction
                "Thriller" -> R.drawable.genre_thriller
                else -> R.drawable.genre_default
            }
        }
    }

}