package org.example.lesson19

import org.example.lesson19.calculator.Calculator
import org.example.lesson19.calculator.CustomMultipleStringOperation
import org.example.lesson19.interitance.ChildrenClass

fun main() {

    val calculator = Calculator(listOf(CustomMultipleStringOperation()))
    println(calculator.operate("5 + 4"))        // 9
    println(calculator.operate("10 - 12"))      // -2
    println(calculator.operate("3.2 * 8"))      // 25.6
    println(calculator.operate("12 / 5"))       // 2.4
    println(calculator.operate("31 % 4"))       // 3
    println(calculator.operate("Mu times 3"))   // MuMuMu


    val child = ChildrenClass("privValue", "protValue", "pubValue")
    child.changeProtectedField("Новое значение")
    println(child.getAll())
}