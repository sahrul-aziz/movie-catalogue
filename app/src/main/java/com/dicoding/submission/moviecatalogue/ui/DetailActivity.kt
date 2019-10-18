package com.dicoding.submission.moviecatalogue.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.bumptech.glide.Glide
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movie = intent.getParcelableExtra<Movie>("movie")
        val actionbar = supportActionBar
        if (movie != null) {
            if (actionbar != null) {
                actionbar.title = movie.title
                actionbar.setDisplayHomeAsUpEnabled(true)
            }

            Glide.with(this).load(movie.poster).into(image_movie_detail)
            tv_release_year.text = movie.year.toString()
            tv_score_detail.text = movie.score.toString()
            tv_runtime_detail.text = movie.runtime
            tv_overview_detail.text = movie.overview
            var actors = mutableListOf<String>()
            for (actor in movie.listOfCast) {
                var actorWithCharacter = "${actor.name} as ${actor.character}"
                actors.add(actorWithCharacter)
            }

            val adapter = ArrayAdapter(this, R.layout.textview_actor, actors)
            list_view_actor.adapter = adapter
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
