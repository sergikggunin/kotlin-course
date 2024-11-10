package org.example.lesson19.interitance

class ChildrenClass(
    privateVal: String,
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    init {
        publicField = "Антонио Бандерас"
    }

    fun changeProtectedField(value: String) {
        protectedField = value
    }
}