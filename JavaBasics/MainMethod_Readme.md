main() is stored in Method Area
public static void main(String[] args)
             public → JVM can access
             static → no object needed
             void → returns nothing
             String[] args → command line input
✔ Order of modifiers does NOT matter

Valid:
public static void main(String[] args)
static public void main(String[] args)
public final static void main(String[] args)

Interface can have main()
Since Java 8, interfaces can contain static methods

main() can be overloaded
JVM always calls only:
public static void main(String[] args)

Why main() is static?
Program starts without creating objects
Static methods can be executed without object creation

