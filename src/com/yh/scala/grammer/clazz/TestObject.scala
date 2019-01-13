package com.yh.scala.grammer.clazz

/**
  * object:
  * 单例的对象，里面定义了类的成员和方法，都是静态的
  * 伴生类对象：当object对象和类的名称一致时，object就是伴生对象，
  * 伴生对象必须和class在同一个文件中
  *
  * class:
  * 类的构造器，类的成员变量
  * 类的主构造器：定义在类的名称后面的
  * 类的辅助构造器：定义在类体重，def this,在的辅助构造器中必须先调用主构造器
  * 类的成员变量：
  * val:对外只提供了get方法
  * var:对外提供了get/set方法
  *
  * 访问权限：
  * 成员变量：private标识的外部无法访问get/set方法
  * 方法：private标识的方法外部无法调用
  * 构造器：private标识的无法再外部访问
  * 类：private[包名]标识这个类在这个包名及其子包下可访问
  *     private[this]标识这个类只能在当前包下访问，子包不可见
  *
  *
  * apply方法：调用object对象时，object()方法时调用就是apply方法
  *
  */
object TestObject {

}
