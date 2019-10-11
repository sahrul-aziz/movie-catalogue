package com.dicoding.submission.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var title: String = "",
    var poster: Int = 0,
    var year: Int = 0,
    var score: Int = 0,
    var overview: String = "",
    var runtime: String = "",
    var listOfGenre: List<String> = listOf(),
    var listOfCast: List<Cast> = listOf()
) : Parcelable