object Hello extends App {

  val clientMessage = client.client.ClientMessage()
    .update(_.clientNumber := 42,
            _.commonMessage.commonNumber := 17)

  println(clientMessage)
}
