package com.dicoding.submission.moviecatalogue.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.RelativeLayout
import android.widget.RelativeLayout.LayoutParams
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.marginStart
import com.bumptech.glide.Glide
import com.dicoding.submission.moviecatalogue.R
import com.dicoding.submission.moviecatalogue.helper.GenreColorDecider
import com.dicoding.submission.moviecatalogue.model.Movie
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movie = intent.getParcelableExtra<Movie>("movie")
        val actionbar = supportActionBar
        if (movie != null) {
            actionbar!!.title = movie.title
            actionbar.setDisplayHomeAsUpEnabled(true)

            Glide.with(this).load(movie.poster).into(image_movie_detail)
            tv_release_year.text = movie.year.toString()
            tv_score_detail.text = movie.score.toString()
            tv_runtime_detail.text = movie.runtime
            tv_overview_detail.text = movie.overview

            var lastId: Int = 0
            for (genre in movie.listOfGenre) {
                val layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                layoutParams.setMargins(20, 0, 20, 0)
                val textView = TextView(this)
//                textView.id = System.currentTimeMillis().toInt()
//                lastId = if (lastId == 0) {
//                    textView.id
//                } else {
//                    layoutParams.addRule(RelativeLayout.END_OF, lastId)
//                    textView.id
//                }

                textView.layoutParams = layoutParams
                textView.text = genre
                textView.setBackgroundResource(GenreColorDecider.decide(genre))
                textView.setTextColor(ContextCompat.getColor(this, R.color.colorWhite))
                textView.setPadding(20, 0, 20, 0)
                this.genre_detail_layout.addView(textView)
            }

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
