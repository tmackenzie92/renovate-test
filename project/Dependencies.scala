import sbt._

object Dependencies {
  val deps = Seq(
    "org.scalatest" %% "scalatest" % "3.2.7" % "test",
    "com.lihaoyi" %% "os-lib" % "0.7.0"
  )
}
