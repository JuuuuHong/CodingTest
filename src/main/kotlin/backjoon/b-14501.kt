package backjoon

import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val day = sc.nextInt()
    val a = Array(day + 1) { 0 }
    val b = Array(day + 1) { 0 }
    val maxSalary = Array(day + 2) { 0 }

    for (i in 1.. day) {
        a[i] = sc.nextInt()
        b[i] = sc.nextInt()
    }

    for (i in day  downTo 1) {
        val nextDay = i + a[i]
        if (nextDay > day + 1) {
            maxSalary[i] = maxSalary[i + 1]
        } else {
            maxSalary[i] = max(b[i] + maxSalary[nextDay], maxSalary[i + 1])
        }
    }

    println(maxSalary[1])
}