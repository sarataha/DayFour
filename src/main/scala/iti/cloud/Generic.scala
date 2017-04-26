package iti.cloud

/**
  * Created by sara on 4/26/17.
  */
object Generic extends App {

  class Stack[T] {
    var elems: List[T] = Nil
    def push(e: T): Unit = {
      elems = e :: elems
    }

    def top: T = elems.head

    def pop(): Unit = {
      elems = elems.tail
    }
  }

  val s = new Stack[Int]
  
}
