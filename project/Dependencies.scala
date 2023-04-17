import sbt._

object Dependencies {
  val jacksonDeps: Seq[ModuleID] = {
    val version = "2.11.4"
    Seq(
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % version,
      "com.fasterxml.jackson.core" % "jackson-databind" % version,
      "com.fasterxml.jackson.core" % "jackson-core" % version,
    )
  }

  val akkaDeps = {
    val version = "2.6.10"
    Seq(
      "com.typesafe.akka" %% "akka-protobuf" % version,
      "com.typesafe.akka" %% "akka-persistence" % version,
      "com.typesafe.akka" %% "akka-persistence-query" % version
    )
  }

  val deps: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.2.7" % "test",
    "com.lihaoyi" %% "os-lib" % "0.9.1",
    "io.cucumber" %% "cucumber-scala" % "4.7.1",
    "io.cucumber" % "cucumber-junit" % "4.7.1"
  )
}
