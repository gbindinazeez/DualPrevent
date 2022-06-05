package com.example.dualapppreventionlibrary

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class CheckCloningTest {

    @ParameterizedTest(name = "a given input of \"{0}\" should return an output of {1}")
    @MethodSource("arguments")
    fun getDotCountReturnsValidDotCount(path: String, expectedDotCount: Int) {
        // given a path
        // use java reflection to get direct access to the private method
        // subject under test
        val sut = CheckCloning
        val getDotCount = sut.javaClass.getDeclaredMethod("getDotCount", String::class.java)
        getDotCount.isAccessible = true

        // when a method to retrieve the number of dots is called
        val actualDotCount = getDotCount.invoke(sut, path)

        // then the method should return the correct number of dots
        assertThat(actualDotCount).isEqualTo(expectedDotCount)
    }

    private companion object {
        @JvmStatic
        fun arguments(): Iterable<Array<Any>> =
            arrayListOf(
                arrayOf("comexample", 0),
                arrayOf("com.example", 1),
                arrayOf("subdomain.topleveldomain.domainname", 2),
                arrayOf("", 0),
                arrayOf(".", 1),
                arrayOf("....", 4)
            )
    }
}