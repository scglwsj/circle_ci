package com.github.scglwsj.circleci

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {

    @Test
    fun `should get 5 when add given 2 and 3`() {
        assertEquals(5, 2 + 3)
    }

}
