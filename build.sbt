ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "renovate-test",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.7" % "test",
      "com.lihaoyi" %% "os-lib" % "0.7.0"
    )
  )
