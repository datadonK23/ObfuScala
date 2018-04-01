import scala.io.Source

package object example {
  lazy val botToken: String = scala.util.Properties
    .envOrNone("BOT_TOKEN")
    .getOrElse(Source.fromResource("bot.token").getLines().mkString)
}
