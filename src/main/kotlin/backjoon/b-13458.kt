package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val array = Array(a, {0})

    for (i in 0 until a) {
        array[i] = sc.nextInt()
    }

    val b = sc.nextInt()
    val c = sc.nextInt()

    var sum = a.toLong()

    for (i in 0 until a) {
        val d = array[i] - b

        if (d > 0) {
            if (d % c == 0) {
                sum += d / c
            } else {
                sum += (d / c) + 1
            }
        }
    }
    print(sum)
}