lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      scalaVersion := "2.12.7",
    )),
  name := "connect-to-http-proxy",
  scalafmtOnCompile := true,
)
