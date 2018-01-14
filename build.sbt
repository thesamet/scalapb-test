scalaVersion := "2.11.7"

scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint")

PB.targets in Compile := Seq(
  PB.gens.java -> (sourceManaged in Compile).value,
  scalapb.gen(singleLineToString = true, javaConversions=true) -> (sourceManaged in Compile).value
)

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.6.7"

