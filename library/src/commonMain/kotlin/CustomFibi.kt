package xyz.malefic.lib.fibonacci

/**
 * Generates an infinite Fibonacci sequence starting from the `firstElement` and `secondElement`.
 * The sequence is lazily evaluated, meaning elements are computed as they are requested.
 *
 * @return A sequence of Fibonacci numbers.
 */
fun generateFibi() =
    sequence {
        var a = firstElement
        yield(a) // Yield the first element of the sequence
        var b = secondElement
        yield(b) // Yield the second element of the sequence
        while (true) {
            val c = a + b
            yield(c) // Yield the next Fibonacci number
            a = b
            b = c
        }
    }

/**
 * The first element of the Fibonacci sequence.
 * This value is expected to be provided by platform-specific implementations.
 */
expect val firstElement: Int

/**
 * The second element of the Fibonacci sequence.
 * This value is expected to be provided by platform-specific implementations.
 */
expect val secondElement: Int
