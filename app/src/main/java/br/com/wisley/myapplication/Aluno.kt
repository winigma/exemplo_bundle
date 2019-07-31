package br.com.wisley.myapplication

import android.os.Parcel
import android.os.Parcelable

class Aluno(val nome: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Aluno> {
        override fun createFromParcel(parcel: Parcel): Aluno {
            return Aluno(parcel)
        }

        override fun newArray(size: Int): Array<Aluno?> {
            return arrayOfNulls(size)
        }
    }
}