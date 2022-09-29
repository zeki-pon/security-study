import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SampleTest {
    @Test
    fun test() {
        val sample = Sample(testProp = "okay")
        Assertions.assertEquals("okay", sample.testProp)
    }
}