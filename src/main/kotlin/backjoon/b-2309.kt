package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val array = MutableList(9, {0})
    var sum = 0

    for (i in 0 until 9) {
        val a = sc.nextInt()
        array[i] = a
        sum += a
    }

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (i == j) {
                continue
            }
            if (array[i] + array[j] == sum - 100) {
                array[i] = 0
                array[j] = 0
                break
            }
        }
        if (array[i] == 0) {
            break
        }
    }

    array.sort()

    for (i in 2 until 9) {
        println(array[i])
    }
}