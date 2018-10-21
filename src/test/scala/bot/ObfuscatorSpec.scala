package bot

import org.scalatest._

class ObfuscatorSpec extends FlatSpec with Matchers {
  "Obfuscator.obfuscate" should "strip first word from input string" in {
    Obfuscator.obfuscate("Test1 Test Test").getOrElse("").split(" ").length shouldEqual 2
  }

  it should "not return input text exactly" in {
    Obfuscator.obfuscate("Test2 Test Test").getOrElse("") should not equal "Test Test"
  }
}
