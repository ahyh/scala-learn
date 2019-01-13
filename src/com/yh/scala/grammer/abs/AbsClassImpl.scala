package com.yh.scala.grammer.abs

object AbsClassImpl extends AbsClass {

  override def eat(food: String) = {
    s"$food 躺着吃"
  }

  def main(args: Array[String]): Unit = {
    AbsClassImpl.swimming("漂着")
  }
}
