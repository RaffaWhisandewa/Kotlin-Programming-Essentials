package com.example.hw02.task2

fun showDeadlineStatus(daysRemaining: Int) {
    if (daysRemaining < 0) {
        println("Overdue")
    } else if (daysRemaining == 0) {
        println("Due today")
    } else {
        println("Upcoming")
    }
}

fun showMonth(month: Int) {
    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }
    println("Month $month: $monthName")
}

fun main() {
    // Bagian A
    println("// daysRemaining = -1")
    showDeadlineStatus(-1)
    println()
    println("// daysRemaining = 0")
    showDeadlineStatus(0)
    println()
    println("// daysRemaining = 2")
    showDeadlineStatus(2)
    println()

    // Bagian B
    println("// month = 9")
    showMonth(9)
    println()
    println("// month = 13")
    showMonth(13)
}