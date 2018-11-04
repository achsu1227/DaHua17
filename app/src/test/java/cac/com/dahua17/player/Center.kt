package cac.com.dahua17.player

class Center (name: String) : Player(name) {

    override fun Attack() {
        println("Center $name Attack")
    }

    override fun Defense() {
        println("Center $name Defense")
    }
}