package com.yh.scala.grammer

object HelloScala {

  def main(args: Array[String]): Unit = {
    //    println("Hello Scala")
    //
    //    /**
    //      * var是可变的数据类型
    //      */
    //    var name = "zhangsan"
    //    println(name)
    //
    //    /**
    //      * 定义之后不可变，值不能修改，相当于Java中的final关键字
    //      */
    //    val age = 13
    //    println(age)
    //
    //    var salary: Double = 9999.99
    //    println(salary)
    //
    //    var s = ()
    //    println(s)
    //
    //    var str = s"name=$name"
    //    println(str)
    //
    //    /**
    //      * for循环
    //      */
    //    var array = Array(1, 2, 3, 4, 5, 6)
    //    for (v <- array) {
    //      println(v)
    //    }
    //
    //    for (v <- 0 until array.length) {
    //      println(array(v))
    //    }
    //
    //    for (v <- array if (v % 2 == 0)) {
    //      println(v)
    //    }
    //
    //    /**
    //      * 双重for循环
    //      */
    //    for (i <- 1 to 3; j <- 1 to 3 if i != j) {
    //      println(i * j)
    //    }
    //
    //    /**
    //      * yield产生一个新的关键字
    //      */
    //    var newArr = for (a <- array if a % 2 == 0) yield a
    //    for (j <- newArr) {
    //      println(j)
    //    }

    println(method1(1, 3))

    sayHello


    println(fun(1, 2))
  }

  def method1(a: Int, b: Int): Int = {
    return a + b
  }

  def sayHello = println("hello")

  var fun = (a: Int, b: Int) => a + b

  val fun1: (Int, Int) => Int = (x, y) => x + y

}
