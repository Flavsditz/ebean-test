package com.example

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.ebean.Database
import io.jooby.*
import io.jooby.ebean.EbeanModule
import io.jooby.hikari.HikariModule
import io.jooby.jdbi.JdbiModule
import io.jooby.json.JacksonModule

class App: Kooby({
  val mapper = JsonMapper.builder()
          .addModule(KotlinModule())
          .build()
  install(JacksonModule(mapper))

  install(HikariModule())
  install(JdbiModule())
  install(EbeanModule())

  setServerOptions(ServerOptions().setPort(8081))

  val db = require(Database::class)
  mvc(Controller(db))
})

fun main(args: Array<String>) {
  runApp(args, App::class)
}
