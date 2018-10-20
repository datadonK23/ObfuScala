package bot

object Obfuscator {
  def obfuscate(text: String): Option[String] = {
    try {
      val tokens = text.split(" ").tail
      val obfuscatedText = tokens.mkString(" ")
      // FIXME do obfuscation
      Some(obfuscatedText)
    } catch {
      case e: Exception => None
    }
  }
}

// FIXME letter map
