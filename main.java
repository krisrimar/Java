/** The main class for printing the string "Hello World" */

/* the above comment is a docummentation and will be handled by the javadoc when there will be one */

//This is the class definition
//Each application begins with a class definition
class HelloWorld
{
  //The main method
  //In Java, every application should contain a main method
  //The main methods signature always remains the same
  //Just like in C++ we have the int main()
  public static void main(String args[]) //the argument of this function can be named in any way you want, but args or argv is preferred
  //Each string in the array above is called a command line argument
  //They allow the user to affect the operation of an application without re-compiling it
  {
    System.out.println("Hello World!"); //prints "Hello World!"
    //This uses the System class from the core library
  }
}
