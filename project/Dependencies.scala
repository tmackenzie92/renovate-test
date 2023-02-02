import sbt._

object Dependencies {
  val deps = Seq(
    "org.scalatest" %% "scalatest" % "3.2.7" % "test",
    "com.lihaoyi" %% "os-lib" % "0.7.0",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.11.4",
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.11.2",
    "com.fasterxml.jackson.core" % "jackson-core" % "2.11.3",
    "io.cucumber" %% "cucumber-scala" % "4.7.1",
    "io.cucumber" % "cucumber-junit" % "4.7.1"
  )
}
