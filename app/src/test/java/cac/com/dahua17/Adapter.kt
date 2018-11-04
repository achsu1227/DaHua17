package cac.com.dahua17

class Adapter : Target() {
    private val adaptee = Adaptee()

    override fun request() {
        adaptee.specificRequest()
    }
}