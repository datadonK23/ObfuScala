package bot

import scala.util.Random


object Obfuscator {
  /* Helper object to obfuscate input text */

  val ObfuscationIndex = 0.4 // magic number, percentage to which degree text should be obfuscated

  def obfuscateToken(token: String, obfuscationIndex: Double): String = {
    val random = new Random

    val dict:Map[String, List[String]] = Map(
      "a" -> List("A", "4", "@", "^"), "b" -> List("B", "|3", "8", "|o", "13", "ß"), "c" -> List("C", "<", "(", "["),
      "d" -> List("D", "1)", "|)", "o|"), "e" -> List("E", "3", "€"), "f" -> List("F", "|=", "|\"", "PH"),
      "g" -> List("G", "9", "6"), "h" -> List("H", "|-|", "}{", ")-(", "4"), "i" -> List("I", "1", "!", "|", "/"),
      "j" -> List("J", "_|"), "k" -> List("K", "|>", "|{"), "l" -> List("L", "|_"),
      "m" -> List("M", "|\\/|", "/v\\", "AA", "^^"), "n" -> List("N", "2", "r", "|\\|", "/V"),
      "o" -> List("O", "0", "°", "*", "<>", "()"), "p" -> List("P", "9", "|?", "|²", "|°"),
      "q" -> List("Q", "0_", "0,", "(,)"), "r" -> List("R", "|2", "12", "2", ".-"), "s" -> List("S", "§", "$", "5"),
      "t" -> List("T", "7", "+"), "u" -> List("U", "|_|", "v", "µ", "[_]"), "v" -> List("V", "\\/", "\\`", "\\|"),
      "w" -> List("W", "vv", "\\A/", "\\^/", "uu"), "x" -> List("X", "><", "%", "}{"),
      "y" -> List("Y", "`/", "'/"), "z" -> List("Z", "2", "\"/_", "(\\)"))

    val obfuscatedToken = token.map(char => if (random.nextFloat() <= obfuscationIndex)
      random.shuffle(dict(char.toString)).headOption.getOrElse(" ")
    else char)

    obfuscatedToken.mkString("")
  }

  def obfuscateText(text: String): Option[String] = {
    try {

      val tokens = text.toLowerCase.split(" ").tail

      val obfuscatedTokens = for (token <- tokens) yield obfuscateToken(token, ObfuscationIndex)
      val obfuscatedText = obfuscatedTokens.mkString(" ")

      Some(obfuscatedText)

    } catch {

      case e: Exception => None

    }
  }
}

