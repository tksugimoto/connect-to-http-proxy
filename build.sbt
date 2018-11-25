lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      scalaVersion := "2.12.7",
    )),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  ),
  name := "connect-to-http-proxy",
  scalafmtOnCompile := true,
)
