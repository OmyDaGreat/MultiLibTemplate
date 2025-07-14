package xyz.malefic.lib.fibonacci

import kotlin.test.Test
import kotlin.test.assertEquals

class WasmJsFibiTest {
    @Test
    fun `test 3rd element`() {
        assertEquals(21, generateFibi().take(3).last())
    }
}
