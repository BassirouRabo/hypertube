import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    @Test
    fun whenAdding1and3_thenAnswerIs4() {
        println("Test passes")
        Assert.assertEquals(1 + 3, 4)
    }
}