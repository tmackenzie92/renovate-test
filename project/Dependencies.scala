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

  val deps: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest" % "3.2.7" % "test",
    "com.lihaoyi" %% "os-lib" % "0.7.0",
    "io.cucumber" %% "cucumber-scala" % "8.14.1",
    "io.cucumber" % "cucumber-junit" % "7.11.1"
  )
}
