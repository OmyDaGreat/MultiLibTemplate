package xyz.malefic.lib.fibonacci

import kotlin.test.Test
import kotlin.test.assertEquals

class JsFibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(11, generateFibi().take(3).last())
    }
}
