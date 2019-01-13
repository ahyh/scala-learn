package com.yh.scala.grammer.tra

object ScalaTraitImpl extends ScalaTrait {

  override def hello(message: String): Unit = {
    println(s"hello:$message")
  }

  /**
    * 如果trait中方法已经有实现，则实现类中必须使用override修饰
    */
  override def small(name: String): Unit = {
    println(s"name:$name")
  }

  def main(args: Array[String]): Unit = {
    hello("yanhuan")
    small("ua")
  }
}
