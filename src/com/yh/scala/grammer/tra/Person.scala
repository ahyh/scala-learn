package com.yh.scala.grammer.tra

class Student {

}

object Person {

  def main(args: Array[String]): Unit = {
    /**
      * 动态混入特质,可以混入多个特质
      */
    var stu = new Student with ScalaTrait with Fly
    stu.hello("hello")
    stu.fly("fly")
  }

}
