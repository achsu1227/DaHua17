package cac.com.dahua17.player

class Forwards(name: String) : Player(name) {

    override fun Attack() {
        println("Forwards $name Attack")
    }

    override fun Defense() {
        println("Forwards $name Defense")
    }

}