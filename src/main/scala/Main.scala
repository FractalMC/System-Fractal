package cn.tapio.sysFrac
package main.scala

import java.util.Scanner
import scala.annotation.tailrec

class Main {
  def main(args: Array[String]): Unit = {
    println("欢迎使用 分析与决策系统——“分形”")
    val scanner = new Scanner(System.in)
    select(scanner)
    scanner.close()
  }
  
  def select(scanner:Scanner): Unit ={
    showCategories()
    val selection = if (scanner.hasNextInt()) scanner.nextInt() else 0
    selection match {
      case 1 =>
        //Function 1
        select(scanner)
      case 2 =>
        //Function 2
        select(scanner)
      case 3 =>
        //Function 3
        select(scanner)
      case 0 =>
      case _ =>
        select(scanner)
    }
  }

  def showCategories(): Unit ={
    println("输入序号以使用模块")
    println("1. Function 1")
    println("2. Function 2")
    println("3. Function 3")
    println("0. 退出程序")
  }
}
