package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val c = Array(100, {0})
    var length = 0

    for (i in 1..a) {
        val b = sc.nextInt()
        val d = Integer.toBinaryString(b)
        length = d.length
        for (j in 0..length - 1) {
            c[j] = d[length-1-j].code
        }
        for (i in 0 .. length - 1) {
            if (c[i].toChar() == '1') {
                print(i)
                print(" ")
            }
        }
    }
}