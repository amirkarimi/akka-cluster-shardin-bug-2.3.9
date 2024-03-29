name := """cluster-sharding-test"""

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-contrib" % "2.3.6",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test")

fork in run := true