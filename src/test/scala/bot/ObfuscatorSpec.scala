package bot

import org.scalatest._

class ObfuscatorSpec extends FlatSpec with Matchers {
  "Obfuscator.obfuscateText" should "strip first word from input string" in {
    Obfuscator.obfuscateText("Test1 Test Test").getOrElse("").split(" ").length shouldEqual 2
  }

  it should "not return input text exactly" in {
    Obfuscator.obfuscateText("Test2 Test Test").getOrElse("") should not equal "Test Test"
  }

  "Obfuscator.obfuscateToken" should "obfuscate all characters in string" in {
    Obfuscator.obfuscateToken("j", 1.0) should (be ("J") or be ("_|"))
  }

  it should "not obfuscate character when obfuscationIndex is 0" in {
    Obfuscator.obfuscateToken("t", 0.0) should be ("t")
  }
}
