import com.fasterxml.jackson.databind.util.JSONPObject
import io.vertx.core.AbstractVerticle
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.json.JsonObject
import io.vertx.core.parsetools.RecordParser
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.OAuth2AuthHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.handler.UserSessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import org.slf4j.LoggerFactory

class FirstVerticle : AbstractVerticle() {


    override fun start() {

/*        var server = vertx.createHttpServer()

        var router = Router.router(vertx)

        router.route().handler({ routingContext ->

            // This handler will be called for every request
            var response = routingContext.response()
            response.putHeader("content-type", "text/plain")

            // Write to the response and end it
            response.end("Hello World from Vert.x-Web!")
        })

        server.requestHandler({ router.accept(it) }).listen(8080)*/

/*

        var router = Router.router(vertx)

// To simplify the development of the web components
// we use a Router to route all HTTP requests
// to organize our code in a reusable way.

// We need cookies and sessions
        router.route().handler(CookieHandler.create())
        router.route().handler(SessionHandler.create(LocalSessionStore.create(vertx)))
// Simple auth service which uses a GitHub to
// authenticate the user
        var authProvider = GithubAuth.create(vertx, "YOUR PROVIDER CLIENTID", "YOUR PROVIDER CLIENT SECRET")
// We need a user session handler too to make sure
// the user is stored in the session between requests
        router.route().handler(UserSessionHandler.create(authProvider))
// we now protect the resource under the path "/protected"
        router.route("/protected").handler(OAuth2AuthHandler.create(authProvider).setupCallback(router.route("/callback")).addAuthority("user:email"))
// Entry point to the application, this will render
// a custom template.
        router.get("/").handler({ ctx ->
            ctx.response().putHeader("Content-Type", "text/html").end("<html>\n  <body>\n    <p>\n      Well, hello there!\n    </p>\n    <p>\n      We're going to the protected resource, if there is no\n      user in the session we will talk to the GitHub API. Ready?\n      <a href=\"/protected\">Click here</a> to begin!</a>\n    </p>\n    <p>\n      <b>If that link doesn't work</b>, remember to provide\n      your own <a href=\"https://github.com/settings/applications/new\">\n      Client ID</a>!\n    </p>\n  </body>\n</html>")
        })
// The protected resource
        router.get("/protected").handler({ ctx ->
            // at this moment your user object should contain the info
            // from the Oauth2 response, since this is a protected resource
            // as specified above in the handler config the user object is never null
            var user = ctx.user()
            // just dump it to the client for demo purposes
            ctx.response().end(user.toString())
        })

        // Read a file
        vertx.fileSystem().readFile("README.md", { result ->
            if (result.succeeded()) {
                println(result.result())
            } else {
                System.err.println("Oh oh ...${result.cause()}")
            }
        })

        // Copy a file
        vertx.fileSystem().copy("README.md", "README2.md", { result ->
            if (result.succeeded()) {
                println("File copied")
            } else {
                System.err.println("Oh oh ...${result.cause()}")
            }
        })

        val obj = JsonObject()

        obj.put("logActivity", true)

        val options = HttpServerOptions(obj)

        val server = vertx.createHttpServer(options)

        server.requestHandler({
            var parser = RecordParser.newDelimited("\n", { h ->
                println(h.toString())
            })

            parser.handle(Buffer.buffer("HELLO WORLD 2\nHOW ARE Y"))
            parser.handle(Buffer.buffer("OU?\nI AM"))
            parser.handle(Buffer.buffer("DOING OK"))
            parser.handle(Buffer.buffer("\n"))
                    it.response().end("Hi there")
                }).listen(8080)

        val logger = LoggerFactory.getLogger("Hello")
        //val logger = Config.log(this)

        logger.info("FirstVerticle start")


        val eb = vertx.eventBus()

        eb.send("third-string", "From First verticle")
        eb.send<Int>("third", 42, {res ->
            println("REQ ${res?.result()?.body()}")
        })

*/




    }
}