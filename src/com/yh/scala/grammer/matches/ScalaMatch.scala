package com.yh.scala.grammer.matches


case class Send(id: String, time: Long)

case class Check()

object ScalaMatch {

  def main(args: Array[String]): Unit = {
    matchValue(1)
    matchValue("1")

    matchType(1)

    matchArray(Array(1, 2, 3))

    matchList(List(1))

    matchObject(Send("1", 1))
  }

  def matchValue(v: Any) = v match {
    case 1 => println("整数1")
    case "1" => println("字符串1")
    case "nihao" => println("你好")
    case _ => println("无匹配")
  }

  def matchType(v: Any) = v match {
    case v: Int => println("整数")
    case v: Long => println("Long")
    case v: String => println("字符串")
    case _ => println("无匹配")
  }

  def matchArray(v: Any) = v match {
    case Array(0) => println("数组只有一个元素0")
    case Array(0, _) => println("数组两个元素，第一个为0")
    case Array(0, _, 3) => println("数组3个元素，第一个为0，第三个位3")
    case Array(1, _*) => println("数组第一个元素为1")
  }

  def matchList(v: Any) = v match {
    case List(0) => println("List只有一个元素0")
    case List(0, _) => println("List两个元素，第一个为0")
    case List(0, _, 3) => println("List有3个元素，第一个为0，第3个位3")
    case List(1, _*) => println("List的第一个元素是1")
    case m :: n if n.length > 0 => println("有头有尾的list")
  }

  def matchTuple(t: Any) = t match {
    case (0, _) => println("元组的第一个元素为0，第二个元素任意")
    case (x, m, n) => println("有3个元素的元组")
    case (_, "A") => println("元组第一个元素任意，第二个元素为A")
  }

  def matchObject(obj: Any) = obj match {
    case Send(x, y) => println(s"send$x$y")
    case Check => println("Check")
  }


}


