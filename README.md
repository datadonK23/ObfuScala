# ObfuScala
Telegram bot, written in Scala, which obfuscates inputs.

Highly inspired from [Scala Telegram Bot tutorial](https://github.com/pme123/scala-telegrambot4s) by [Pascal Mengelt](https://github.com/pme123).

## Usage
Start a conversation with BotFather on Telegram. Create a `/newbot` and copy its HTTP API token in file `src/main/resources/bot.token`. To initialize sbt project, execute `sbt`in project root.  Start the bot with the `run` command and select `[1] bot.BotApp`. Thereafter you can `/start` the conversation with ObfuScala bot on Telegram.

## License
Apache License, Version 2.0. See LICENSE file in project root.