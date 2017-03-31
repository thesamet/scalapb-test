scalaVersion := "2.12.1"

scalaOrganization in ThisBuild := "org.typelevel"

scalacOptions += "-Xfatal-warnings"

PB.targets in Compile := Seq(
  scalapb.gen(singleLineToString = true) -> (sourceManaged in Compile).value
)

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.5.47"

