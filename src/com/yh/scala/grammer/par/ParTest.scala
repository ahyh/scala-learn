package com.yh.scala.grammer.par

object ParTest {

  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 3, 4, 5)
    val a = list.par.fold(0)(_ + _)

    println(a)
  }

}
