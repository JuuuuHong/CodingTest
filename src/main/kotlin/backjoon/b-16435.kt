package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val fruit = sc.nextInt()
    var snake = sc.nextInt()
    val array = Array(fruit, {0})
    for (i in 0 until fruit) {
        array[i] = sc.nextInt()
    }
    array.sort()
    for (i in 0 until fruit) {
        if (array[i] <= snake) {
            snake++
        }
    }
    print(snake)
}