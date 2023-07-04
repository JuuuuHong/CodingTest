package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val array = Array(10000, {0})
    var sum = 0
    var max = 0

    for (i in 1..10) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        sum -= a
        sum += b

        array[i] = sum
    }

    max = array[1]

    for (i in 1..10) {
        if (array[i] > max) {
            max = array[i]
        }
    }

    print(max)
}