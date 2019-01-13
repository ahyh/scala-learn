package com.yh.scala.grammer

object MyPartialFuncation {

  def main(args: Array[String]): Unit = {
    println(myPartial("a"))
  }

  /**
    * 偏函数
    *
    * @return
    */
  def myPartial: PartialFunction[String, Int] = {
    case "a" => 98
    case _ => 0
  }

}
