package com.example.practice15

import android.os.Parcel
import android.os.Parcelable

class User() : Parcelable {
    private var poroda: String = ""
    private var god: String = ""
    private var mounth: String = ""
    constructor(parcel: Parcel) : this() {
        poroda = parcel.readString().toString()
        god = parcel.readString().toString()
        mounth = parcel.readString().toString()
    }
    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }
        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_poroda: String, _god: String, _mounth: String) : this() {
        poroda = _poroda
        god = _god
        mounth = _mounth
    }
    fun setName(_name: String){
        poroda = _name
    }
    fun getName(): String {
        return poroda
    }
    fun setCompany(_company: String){
        god = _company
    }
    fun getCompany(): String {
        return god
    }
    fun setAge(_mounth: String){
        mounth = _mounth
    }
    fun getAge(): String {
        return mounth
    }
    override fun describeContents(): Int {
        return 0
    }
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(poroda)
        dest?.writeString(god)
        dest?.writeString(mounth)
    }

}