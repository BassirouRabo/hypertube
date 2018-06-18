
import io.vertx.core.AbstractVerticle
import io.vertx.core.DeploymentOptions
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.logging.LoggerFactory

import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.StaticHandler




class App : AbstractVerticle() {

    override fun start() {
        //Config.log(this)

        vertx.deployVerticle(FirstVerticle())
        vertx.deployVerticle(SecondVerticle())
        vertx.deployVerticle(ThirdVerticle())

    }

}