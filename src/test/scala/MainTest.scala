import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by Santosh.Ganapa on 02-06-2018.
  */
class MainTest extends FlatSpec with Matchers {

  import MainTest._

   "getSum function" should "return sum of all int elements from array" in {
     val inputArray = Array(1,2,3)
     obj.getSum(inputArray) shouldEqual(6)
   }
  }

object MainTest {
  val obj = new Main()
}
