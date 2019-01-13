package com.yh.scala.grammer

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {

  def main(args: Array[String]): Unit = {
    var arr = ArrayBuffer(1, 2, 4);
    arr += (3, 4)
    for (i <- arr) {
      println(s"i=$i")
    }

    val s = 9::List(1,2)
    for (i <- s) println(i)
  }

}
