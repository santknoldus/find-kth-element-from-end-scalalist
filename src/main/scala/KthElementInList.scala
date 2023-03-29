package com.knoldus.findelementinlist

import scala.util.Try

class KthElementInList {

  //to find kth element in a generic list
  def findKthElement[A](list: List[A], position: Int): Try[A] = Try{
    list(list.length - position)
  }
}