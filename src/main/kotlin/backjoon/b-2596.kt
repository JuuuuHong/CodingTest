package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = "000000"
    val b = "001111"
    val c = "010011"
    val d = "011100"
    val e = "100110"
    val f = "101001"
    val g = "110101"
    val h = "111010"

    val input1 = sc.nextInt()
    val input2 = sc.nextLine()
    var count = 0
    val charArray = CharArray(10)
    var bo = false

    for (i in 0 until input2.length / 6) {

        when (input2.substring(0 until 6 * i)) {
            a -> {
                count += 1
                charArray[i] = 'A'
            }
            b -> {
                count += 1
                charArray[i] = 'B'
            }
            c -> {
                count += 1
                charArray[i] = 'C'
            }
            d -> {
                count += 1
                charArray[i] = 'D'
            }
            e -> {
                count += 1
                charArray[i] = 'E'
            }
            f -> {
                count += 1
                charArray[i] = 'F'
            }
            g -> {
                count += 1
                charArray[i] = 'G'
            }
            h -> {
                count += 1
                charArray[i] = 'H'
            }
            else -> {
                bo = false
                println(count)
            }
        }
    }

    if (bo) {
        for (i in charArray.indices) {
            if (charArray[i + 1] == null) {
                break
            }
            print(charArray[i])
        }
    }
}