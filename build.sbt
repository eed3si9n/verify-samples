val dottyVersion = "0.18.1-RC1"
ThisBuild / scalaVersion := dottyVersion

lazy val root = (project in file("."))
  .settings(
    name := "dotty-verify",
    version := "0.1.0",
    libraryDependencies += "com.eed3si9n.verify" %% "verify" % "0.2.0" % Test,
    testFrameworks += new TestFramework("verify.runner.Framework"),
  )
