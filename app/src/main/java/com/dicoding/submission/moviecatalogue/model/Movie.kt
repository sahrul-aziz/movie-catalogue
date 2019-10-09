package com.dicoding.submission.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val title: String = "",
    val poster: Int = 0,
    val year: Int = 0,
    val score: Int = 0,
    val overview: String = "",
    val runtime: String = "",
    val listOfGenre: List<String> = listOf(),
    val listOfCast: List<Cast> = listOf()
) : Parcelable