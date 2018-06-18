import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Config {

    fun log(name: Any) : Logger = LoggerFactory.getLogger(name.javaClass.canonicalName)

}