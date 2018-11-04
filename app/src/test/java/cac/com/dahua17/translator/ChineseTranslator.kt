package cac.com.dahua17.translator

import cac.com.dahua17.player.ForeginCenter
import cac.com.dahua17.player.Player

class ChineseTranslator (name: String) : Player(name) {

    private val foreginCenter = ForeginCenter(name)

    override fun Attack() {
        foreginCenter.進攻()
    }

    override fun Defense() {
        foreginCenter.防守()
    }

}