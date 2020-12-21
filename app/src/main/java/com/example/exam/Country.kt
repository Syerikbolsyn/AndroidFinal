package com.example.exam

import android.os.Parcel
import android.os.Parcelable
import android.os.PersistableBundle


data class Country(
    val name: String?,
    val id: Int,
    val photo: PersistableBundle?,
    var code: String?

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readPersistableBundle(),
       parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(id)
        parcel.writeString(code)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Country> {
        override fun createFromParcel(parcel: Parcel): Country {
            return Country(parcel)
        }

        override fun newArray(size: Int): Array<Country?> {
            return arrayOfNulls(size)
        }
    }
}