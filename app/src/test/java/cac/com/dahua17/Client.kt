package cac.com.dahua17

import cac.com.dahua17.player.Forwards
import cac.com.dahua17.player.Guards
import cac.com.dahua17.translator.ChineseTranslator
import org.junit.Test

class Client {
    @Test
    fun main() {
        val b = Forwards("巴蒂爾")
        b.Attack()

        val m = Guards("麥格雷迪")
        m.Attack()

        val ym = ChineseTranslator("姚明")
        ym.Attack()
        ym.Defense()
    }
}