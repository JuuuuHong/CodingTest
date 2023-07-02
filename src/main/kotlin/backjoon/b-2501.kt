package backjoon

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    var c = 0
    val array = Array(10000) { 0 }

    for (i in 1..a) {
        if (a % i == 0) {
            if (i < array[b - 1]) {
                break
            }
            array[c] = i
            c++
        }
    }
    print(array[b - 1])
}