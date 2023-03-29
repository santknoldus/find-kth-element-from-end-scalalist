package com.knoldus.findelementinlist

object KthElementInListApp extends App {

  val list: List[Int] = List(1, 2, 3, 4, 5, 6)

  val kthElementInList = new KthElementInList

  private val result = kthElementInList.findKthElement(list, 2)

  println(result)
}
