package xyz.malefic.lib.fibonacci

import xyz.malefic.lib.fibonacci.firstElement
import xyz.malefic.lib.fibonacci.generateFibi
import xyz.malefic.lib.fibonacci.secondElement
import kotlin.test.Test
import kotlin.test.assertEquals

class FibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(firstElement + secondElement, generateFibi().take(3).last())
    }
}
