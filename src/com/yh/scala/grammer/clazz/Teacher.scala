package com.yh.scala.grammer.clazz

/**
  * 在scala中定义类使用class关键字
  * 默认使用空参构造方法
  *
  * 定义在类名称后面的构造器叫主构造器
  * 类的主构造器中的属性会定义成类的成员变量
  * 如果主构造器中的成员属性没有var/val修饰的话，该属性不能被访问，相当于没有提供get/set方法
  * 如果成员属性用var修饰的话相当于提供了get/set方法
  *
  * private 类的访问权限
  * 在构造器前加访问权限，加private说明是私有的，外部不能访问
  *
  * 类的成员属性访问权限：
  * 如果类的成员属性访问权限是private，则说明get/set方法都是私有的，外部不能访问
  *
  * 类的访问权限，如果class前加private[this]，表示类是私有的，只能在当前包下可用,当前包的子包不可见
  * 类的访问权限，如果class前加private[包名]，表示类是私有的，在包名及其子包下都可用
  */
class Teacher(private var name: String, var age: Int) {

  //  var name: String = _
  //
  //  var age: Int = _

  var sex: String = _

  //再定义辅助构造器
  def this(name: String, age: Int, sex: String) {
    //在辅助构造器中必须先定义主构造器
    this(name, age)
    this.sex = sex
  }

}

/**
  * 这个对象就是Teacher类的伴生对象
  * 在伴生对象中可以访问类的成员和方法
  */
object Teacher {

  def apply(name: String, age: Int): Teacher = {
    //初始化工作
    new Teacher(name, age, "male")
  }

  def main(args: Array[String]): Unit = {
    val t = new Teacher("dahai", 18)
    println(t.name)

    val tt = Teacher("dahai", 29)
    println(tt.sex)
  }
}
