// File: Main.kt
// KotlinAssignment1
// This file contains solutions to basic algorithm challenges in Kotlin

/**
 * A. Function that sums integers from 1 up to a specified maximum
 *
 * @param max The upper limit for the summation
 * @return The sum of all integers from 1 to max
 */
fun sumUpToMax(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}

/**
 * B. Iterative function that calculates the factorial of a specified integer
 *
 * @param n The number to calculate factorial for
 * @return The factorial of n
 */
fun factorialIterative(n: Int): Long {
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers")
    if (n == 0 || n == 1) return 1

    var result: Long = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}

/**
 * C. Lambda expression that calculates factorial
 *
 * This uses fold to accumulate the product of numbers from 1 to n
 */
val factorialLambda: (Int) -> Long = { n ->
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers")
    if (n == 0 || n == 1) 1
    else (2..n).fold(1L) { acc, i -> acc * i }
}

/**
 * D. Recursive function that calculates factorial
 *
 * @param n The number to calculate factorial for
 * @return The factorial of n
 */
fun factorialRecursive(n: Int): Long {
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers")
    return when (n) {
        0, 1 -> 1
        else -> n * factorialRecursive(n - 1)
    }
}

/**
 * Main function to test the implementations
 */
fun main() {
    // Test for function A
    val maxNumber = 10
    println("Sum of numbers from 1 to $maxNumber = ${sumUpToMax(maxNumber)}")

    // Test for function B
    val factNumber = 5
    println("Factorial of $factNumber (iterative) = ${factorialIterative(factNumber)}")

    // Test for function C
    println("Factorial of $factNumber (lambda) = ${factorialLambda(factNumber)}")

    // Test for function D
    println("Factorial of $factNumber (recursive) = ${factorialRecursive(factNumber)}")
}