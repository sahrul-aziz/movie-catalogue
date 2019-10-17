package com.dicoding.submission.moviecatalogue.helper

import com.dicoding.submission.moviecatalogue.R

object GenreColorDecider {

    fun decide(genre: String) : Int {
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