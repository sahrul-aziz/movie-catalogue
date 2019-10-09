package com.dicoding.submission.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cast(
    val name: String = "",
    val character: String = ""
) : Parcelable