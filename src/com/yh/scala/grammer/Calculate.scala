package com.yh.scala.grammer

object Calculate {

  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println(add2(add, 1, 3))


  }

  /**
    * 拥有2个Int类型的参数，返回值为2个Int类型的和
    */
  def add(a: Int, b: Int) = {
    a + b
  }

  /**
    * 拥有3个参数，第一个参数是一个函数，第2/3个位Int类型的参数
    */
  def add2(fun: (Int, Int) => Int, a: Int, b: Int) = {
    fun(a, b)
  }

}
