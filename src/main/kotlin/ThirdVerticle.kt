import io.vertx.core.AbstractVerticle

class ThirdVerticle: AbstractVerticle() {
    override fun start() {
        println("ThirdVerticle start 2")

        vertx.eventBus().consumer<String>("third-string", {
            println("Third Verticle RESPONSE STRING  ${it?.body()}")
        })

        vertx.eventBus().consumer<Int>("third", {
            println("Third Verticle RESPONSE INT 1 ${it?.body()}")

            it.reply(21)
        })
    }
}