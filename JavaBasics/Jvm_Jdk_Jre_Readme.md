JVM (Java Virtual Machine)
Executes Java bytecode
Platform dependent

JRE (Java Runtime Environment)
JVM + Java libraries
Used to run Java programs

JDK (Java Development Kit)
JRE + compiler (javac) + tools
Used to develop Java programs

Flow:
JDK → JRE → JVMs

Java Execution Flow
1.     JVM starts
2.     Class Loader loads .class file
3.     Bytecode is verified and prepared
4.     JVM calls main()
.java → (javac) → .class → (java) → JVM → Output
.java → source code
.class → bytecode
JVM converts bytecode to machine code


javac vs java
javac → Compiles .java to .class
java → Runs .class using JVM



