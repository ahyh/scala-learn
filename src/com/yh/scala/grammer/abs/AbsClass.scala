package com.yh.scala.grammer.abs

/**
  * 使用关键字abstract定义抽象类
  * 可以有具体的实现，也可以没有
  */
abstract class AbsClass {

  def eat(food: String): String

  def swimming(style: String): Unit = {
    println(s"swimming:$style")
  }

}
