package xyz.malefic.lib.fibonacci

import xyz.malefic.lib.fibonacci.generateFibi
import kotlin.test.Test
import kotlin.test.assertEquals

class AndroidFibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(3, generateFibi().take(3).last())
    }
}
