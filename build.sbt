import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.runProtoc in PB.protobufConfig := (args =>
  com.github.os72.protocjar.Protoc.runProtoc("-v300" +: args.toArray))

version in PB.protobufConfig := "3.0.0-beta-2"

lazy val common = (project in file("common")).
  settings(PB.protobufSettings)

lazy val client = (project in file("client")).
  settings(PB.protobufSettings ++ Seq(
    // If you want proto files in client to import proto files in common.
    PB.includePaths in PB.protobufConfig += file("common/src/main/protobuf")
  )).
  dependsOn(common)

