package foo

import verify._

object SomethingTest extends BasicTestSuite {
  test("long string") {

    val str1 = """Don't you love New York in the fall? It makes me want to buy
    |school supplies. I would send you a bouquet of newly-sharpened pencils if
    |I knew your name and address. On the other hand, this not knowing has its
    |charms.""".stripMargin


    val str2 = """you love London in the fall? It makes me want to buy
    |school supplies: I would send you a bouquet of newly-sharpened kitchen
    |knives if I knew your name and address. on the other hand, this not knowing has its
    |charms.""".stripMargin

    assertEquals(str1, "Don't " + str2, "custom message")
  }
}
