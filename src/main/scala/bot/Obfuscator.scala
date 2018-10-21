package bot

object Obfuscator {
  """Helper object to obfuscate input text"""

  def obfuscate(text: String): Option[String] = {
    val dict = Map("a" -> ("A", "4", "@", "^"), "b" -> ("B", "|3", "8", "|o", "13", "ß"), "c" -> ("C", "<", "(", "["),
      "d" -> ("D", "1)", "|)", "o|"), "e" -> ("E", "3", "€"), "f" -> ("F", "|=", "|\"", "PH"), "g" -> ("G", "9", "6"),
      "h" -> ("H", "|-|", "}{", ")-(", "4"), "i" -> ("I", "1", "!", "|", "/"), "j" -> ("J", "_|"),
      "k" -> ("K", "|>", "|{"), "l" -> ("L", "|_"), "m" -> ("M", "|\\/|", "/v\\", "AA", "^^"),
      "n" -> ("N", "2", "r", "|\\|", "/V"), "o" -> ("O", "0", "°", "*", "<>", "()"),
      "p" -> ("P", "9", "|?", "|²", "|°"), "q" -> ("Q", "0_", "0,", "(,)"), "r" -> ("R", "|2", "12", "2", ".-"),
      "s" -> ("S", "§", "$", "5"), "t" -> ("T", "7", "+"), "u" -> ("U", "|_|", "v", "µ", "[_]"),
      "v" -> ("V", "\\/", "\\`", "\\|"), "w" -> ("W", "vv", "\\A/", "\\^/", "uu"), "x" -> ("X", "><", "%", "}{"),
      "y" -> ("Y", "`/", "'/"), "z" -> ("Z", "2", "\"/_", "(\\)"))

    try {
      val tokens = text.toLowerCase.split(" ").tail
      val obfuscatedText = tokens.mkString(" ")
      // FIXME do obfuscation
      println(dict.values.toString())
      Some(obfuscatedText)
    } catch {
      case e: Exception => None
    }
  }
}

