package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val day = sc.nextInt()
    val sangdam = Array(day, {0})
    val money = Array(day, {0})
    var average = Array<Long>(day, {0})
    val saveI = Array(day, {0})

    for (i in 0 until day) {
        sangdam[i] = sc.nextInt()
        money[i] = sc.nextInt()

        if (day - i < sangdam[i]) {
            average[i] = 0
            continue
        }

        average[i] = (money[i] / sangdam[i]).toLong()
        saveI
    }

    average.sort()

    for (i in 0 until day) {
        if (average[i] == 0.toLong())
            continue


    }

}