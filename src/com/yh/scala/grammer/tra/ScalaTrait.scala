package com.yh.scala.grammer.tra

/**
  * 特质，类似于Java中的interface
  *
  * 在scala中特质可以定义有实现的方法，也可以定义没有实现的方法
  */
trait ScalaTrait {

  /**
    * 没有任何实现的方法
    */
  def hello(message: String): Unit = {
    println(s"$message")
  }

  def small(name: String): Unit = {
    println(s"small:$name")
  }
}
