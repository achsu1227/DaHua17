package cac.com.dahua17

import org.junit.Test

class Client {
    @Test
    fun main() {
        val target = Adapter()
        target.request()
    }
}