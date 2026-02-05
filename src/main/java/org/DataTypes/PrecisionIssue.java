package org.DataTypes;

public class PrecisionIssue {


public static void main(String[] args){
    System.out.println(0.1 + 0.2);
    }
}
//o/p: 0.30000000000000004 -
// 0.1 also has infinite decimal points and 0.2 also have infinite decimal points, so JVM chooses closest approximation and tiny round error occurs
// Because floating-point numbers are stored in binary and 0.1 & 0.2 can’t be represented exactly.

//double has higher precision, but both suffer from floating-point rounding errors.
//For money we need accurate values so we can use BigDecimal(provides exact precision and avoids rounding errors).
