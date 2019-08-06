package chap3

/**
 * TopLevel Function will be compiled into java static method
 *
 * <pre>
 *  public class TopLevelFunctionAndPropertiesKt {
 *      public static void someMethod() {}
 *  }
 * </pre>
 */
fun someMethod() {}

/**
 * TopLevel Property will be compiled into java static private property
 * TopLevel Property with 'const' keyword will be compiled into java static public property (public static final)
 * <pre>
 *  public class TopLevelFunctionAndPropertiesKt {
 *      private static int someVariable = 123;
 *      private static final int someValue = 456;
 *      // getter & setter for someVariable and someValue
 *
 *      public static final int constVariable = 789;
 *  }
 * </pre>
 */
var someVariable = 123
val someValue = 456
const val constVariable = 789

fun main(args: Array<String>) {
}