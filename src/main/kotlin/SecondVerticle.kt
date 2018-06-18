import io.vertx.core.AbstractVerticle


class SecondVerticle : AbstractVerticle() {

    override fun start() {
        val logger = Config.log(this)

        //logger.info("start")

        println("SecondVerticle start")

    }
}