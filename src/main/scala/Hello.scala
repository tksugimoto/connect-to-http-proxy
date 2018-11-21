object Hello extends App {
  args.zipWithIndex foreach {
    case (arg, i) =>
      println(s"$i: $arg")
  }
}
