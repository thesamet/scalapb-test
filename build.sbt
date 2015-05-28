import com.trueaccord.scalapb.{ScalaPbPlugin => PB}

PB.protobufSettings

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime" % "0.4.14" % PB.protobufConfig
