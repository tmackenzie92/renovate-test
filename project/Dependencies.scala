import sbt._

object Dependencies {
  val jacksonDeps: Seq[ModuleID] = {
    val jacksonVersion = "2.11.4"
    Seq(
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % jacksonVersion,
      "com.fasterxml.jackson.core" % "jackson-databind" % jacksonVersion,
      "com.fasterxml.jackson.core" % "jackson-core" % jacksonVersion,
    )
  }

  val akkaDeps = {
    val akkaVersion = "2.6.10"
    Seq(
      "com.typesafe.akka" %% "akka-protobuf" % akkaVersion,
      "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
      "com.typesafe.akka" %% "akka-persistence-query" % akkaVersion
    )
  }

  val deps: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.2.7" % "test",
    "com.lihaoyi" %% "os-lib" % "0.7.0",
    "io.cucumber" %% "cucumber-scala" % "8.16.0",
    "io.cucumber" % "cucumber-junit" % "7.13.0"
  )
}
