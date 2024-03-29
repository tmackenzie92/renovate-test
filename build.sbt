import Dependencies.{deps, akkaDeps, jacksonDeps}

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "renovate-test",
    libraryDependencies ++= deps ++ jacksonDeps ++ akkaDeps
  )
