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
                val runtime = "Runtime: ${movie.runtime}"
                tv_runtime.text = runtime
                tv_overview.text = movie.overview
            }
        }


    }

}