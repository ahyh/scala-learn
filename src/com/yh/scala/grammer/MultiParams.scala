package com.yh.scala.grammer

object MultiParams {

  def main(args: Array[String]): Unit = {
    multi("y", "h")
    println("sum=" + sum(1, 2, 3, 4))
    default(a = 3)
    default(a = 3, b = 3)
    println(apply(layout, 10))
    println(partAdd(3))
    println(partAdd)
    println(addCurrying(1)(2))
  }

  /**
    * 可变参数的入参方法
    *
    * @param a
    */
  def multi(a: String*): Unit = {
    for (i <- a) {
      println(i)
    }
  }

  /**
    * 整数求和
    *
    * @param a
    * @return
    */
  def sum(a: Int*): Int = {
    var sum: Int = 0
    for (i <- a) {
      sum += i
    }
    sum
  }

  def default(a: Int = 1, b: Int = 2): Unit = {
    println(s"a+b =${a + b}")
  }

  def apply(f: Int => String, v: Int) = {
    f(v)
  }

  def layout(x: Int): String = {
    "[" + x.toString + "]"
  }

  def fun: (Int, Int) => Int = (x, y) => {
    x + y
  }

  def add(a: Int, b: Int) = {
    a + b
  }

  /**
    *
    * @param a
    * @param b
    * @return
    */
  def addCurrying(a: Int)(b: Int): Int = a + b

  /**
    * 部分参数应用方法
    *
    * @return
    */
  def partAdd = add(1, _: Int)

}
