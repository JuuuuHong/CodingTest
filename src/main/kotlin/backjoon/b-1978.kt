package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    var c = false
    var sum = 0

    for (i in 0 until a) {
        val b = sc.nextInt()

        if (b > 1) {
            c = true
            for (j in 2..b / 2) {
                if (b % j == 0) {
                    c = false
                    continue
                }
            }

            if (c) {
                sum ++
            }
        }
    }

    print(sum)
}