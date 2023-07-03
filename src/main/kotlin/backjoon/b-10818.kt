package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val array = Array(a, {0})

    for (i in 0 until a) {
        val b = sc.nextInt()
        array[i] = b
    }
    var max = array[0]
    var min = array[0]

    for (i in 0 until a) {
        if (array[i] > max) {
            max = array[i]
        }
        if (array[i] < min) {
            min = array[i]
        }
    }
    print(min)
    print(" ")
    print(max)
}