package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = Array(10, {0})
    val b = Array(10, {0})
    var aSum1 = 0
    var bSum1 = 0
    var aSum2 = 0
    var bSum2 = 0
    var c = false

    for (i in 1..9) {
        a[i] = sc.nextInt()
        aSum1 += a[i]
    }

    for (i in 1..9) {
        b[i] = sc.nextInt()
        bSum1 += b[i]
    }

    if (aSum1 >= bSum1) {
        print("No")
    } else {
        for (i in 1..9) {
            aSum2 += a[i]
            bSum2 += b[i - 1]
            if (aSum2 > bSum2) {
                c = true
                print("Yes")
                break
            }
        }
        if (!c) {
            print("No")
        }
    }
}