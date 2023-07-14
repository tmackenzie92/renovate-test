import sbt._

object Dependencies {
  val jacksonDeps: Seq[ModuleID] = {
    val jacksonVersion = "2.15.2"
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
    "io.cucumber" %% "cucumber-scala" % "4.7.1",
    "io.cucumber" % "cucumber-junit" % "4.7.1",
    "com.typesafe.play" %% "play-json" % "2.7.1"
  )
}
