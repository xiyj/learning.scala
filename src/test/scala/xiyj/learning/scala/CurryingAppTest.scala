package xiyj.learning.scala

import collection.mutable.Stack
import org.scalatest.FlatSpec

class CurryingAppTest extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  "Curry process" should "properly handle list of number" in {
    val even = (a: Int) => a % 2 == 0
    val processEven = CurryingApp.process(even) _
    val numAsc = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
    val result = processEven(numAsc)
    println("numAsc : " + result.toString())
    assert(result == (List(2,4)))
    assert(result(0) == 2)
    assert(result(1) == 4)
    // == (List(2,4)))
  }

  //  it should "throw NoSuchElementException if an empty stack is popped" in {
  //	  val emptyStack = new Stack[String]
  //			  assertThrows[NoSuchElementException] {
  //		  emptyStack.pop()
  //	  }
  //  }
}