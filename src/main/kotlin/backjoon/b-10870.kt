package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val array = Array(10000, {0})

    for (i in 1..a) {
        if (i == 1) {
            array[i] = 1
            continue
        }
        array[i] = array[i - 2] + array[i - 1]
    }
    print(array[a])
}