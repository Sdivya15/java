Class:
A Java class is a blueprint that defines properties and behaviors using variables, constructors, methods, and blocks.

Structure of class:
[access-modifier] class ClassName {

    // Fields (variables)
    [access-modifier] [static] dataType variableName;

    // Static block (optional)
    static {
        // static initialization
    }

    // Instance block (optional)
    {
        // instance initialization
    }

    // Constructors
    [access-modifier] ClassName(parameters) {
        // constructor body
    }

    // Methods
    [access-modifier] [static] returnType methodName(parameters) {
        // method body
    }
}



class ClassName {
variables;
constructors;
methods;
}
