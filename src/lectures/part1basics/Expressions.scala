package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  //Expression
  // +  - * / | & ^ << >> >>>
  // == != <= >= < >
  // ! && ||

  var aVariable  = 2
  aVariable += 3  // Also works with -= *= /=   ( Only work with variables )  Side effects

  // Instructions (DO) VS  Expressions (VALUE)

  // IF expression
  val aCondition = true
  var aConditionedValue = if ( aCondition ) 5 else 3   // IF expression
  println(aConditionedValue)





}
