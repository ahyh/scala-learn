package com.yh.scala.grammer

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    //    var arr:Array[String] = new Array[String](3);

    val arr = Array(1, 2, 3, 4, 5)
    for (s <- arr.map(_ * 10)) println(s)

    val strArr = Array("hello ni hao happly", "world is happly amazing hello hao")
    //    val strs = strArr.map(_.split(" "))
    //    for (s <- strs.flatten) println(s)

    strArr.flatMap(_.split(" ")).foreach(println)

    strArr.flatMap(_.split(" ")).groupBy(x => x).mapValues(_.length).foreach(println)

  }

  def fun: Int => Int = x => {
    x * 10
  }


}
