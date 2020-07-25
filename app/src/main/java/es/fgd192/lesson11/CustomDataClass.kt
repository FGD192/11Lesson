package es.fgd192.lesson11

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CustomDataClass(
    var id: Int,
    var title: String
): Parcelable


