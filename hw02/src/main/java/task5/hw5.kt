package com.example.hw02.task5

fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()

    print("Exam score: ")
    val exam = readln().toInt()

    // Pakai 2.0 supaya hasilnya Double (desimal tidak hilang)
    val average = (assignment + exam) / 2.0

    // if sebagai ekspresi
    val status = if (average >= 60) "Pass" else "Needs improvement"

    println("Average: $average")
    println("Status: $status")
}