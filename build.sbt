import scalapb.compiler.Version.scalapbVersion

scalaVersion := "2.11.12"

scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint")

enablePlugins(ScalaNativePlugin)

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %%% "scalapb-runtime" % scalapbVersion
)
