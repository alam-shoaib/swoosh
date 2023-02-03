package com.example.swoosh.Models

import android.os.Parcel
import android.os.Parcelable

class Playes constructor(var leauge:String,var skill:String):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(leauge)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Playes> {
        override fun createFromParcel(parcel: Parcel): Playes {
            return Playes(parcel)
        }

        override fun newArray(size: Int): Array<Playes?> {
            return arrayOfNulls(size)
        }
    }
}