package cac.com.dahua17.player

class Guards(name: String) : Player(name) {

    override fun Attack() {
        println("Guards $name Attack")
    }

    override fun Defense() {
        println("Guards $name Defense")
    }

}