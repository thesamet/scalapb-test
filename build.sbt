PB.targets in Compile := Seq(
  scalapb.gen(singleLineToString = true) -> (sourceManaged in Compile).value
)

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.5.43"

