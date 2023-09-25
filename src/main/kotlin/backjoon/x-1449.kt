package backjoon

import java.util.Scanner

// 나중에 다시 시도 !!!!!!!!!11

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val array = Array(a + 1, {0})
    var sum = 0
    var d = false
    var e = 1

    for (i in 0 until 4) {
        array[i] = sc.nextInt()
    }

    array.sort()

    for (i in 0 until 3) {
        d = false
        while (!d) {
            val c = array[i + e] - array[i]
            if (e >= array.size - i) {
                break
            }
            if (c < b) {
                ++e
                sum++
            } else {
                e = 1
                d = true
            }
        }
    }
    print(sum)
}