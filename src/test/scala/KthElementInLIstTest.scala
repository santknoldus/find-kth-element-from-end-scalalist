package com.knoldus.findelementinlist

import org.scalatest.funsuite.AnyFunSuite
import scala.util.Success

class KthElementInLIstTest extends AnyFunSuite {

  val kthElementInList = new KthElementInList

  test("") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)
    val result = kthElementInList.findKthElement(list, 2)
    val expectedResult = Success(5)

    assert(result === expectedResult)
  }

  test("if element not found") {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6)

    assert(kthElementInList.findKthElement(list, 8).isFailure)
  }
}