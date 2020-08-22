package com.company;
//Every Java program has a class name which must match the filename

public class Main {
//    The main() method is required and you will see it in every Java program:

    static void myFirstMethod_0(){
        /*
        ======= ======= 0: Methods ======= =======

        myMethod()
            - is the name of method
        static
            - means that the method belongs to the Main class and not an object of the Main class
        void
            - means that this method does not have a return value


        - Call method with: myMethod() in main
        */
        System.out.println("This is printing from myFirstMethod");
    }

    static void variables_1 (){

        /*
         ======= ======= 1: Variables ======= =======
        To create a variable, you must specify the type and assign it a value:

       type variable = value;


        * All Java variables must be identified with unique names.



        ---------- Variable Types ----------

        String
            -stores text
            - surrounded by "" double quotes
        int
            - stores integers (whole numbers) without decimals
        float
            - stores floating point numbers, with decimals
        char
            - stores single characters,
            - sorrounded by '' single quotea

         */

        String myString = "I'm a string!!";
        System.out.println("myString says " + myString);

        int myInteger = 69 ;
        /*   is the same as:
                int myNum;
                myNum = 15;
         */
        System.out.println("myInteger says " + myInteger);

//         Declare Many variables:
        int x = 7, y = 92, z = -10;
        System.out.println(x + y + z);
    }

    static void dataTypes_2() {
            /*
             ======= ======= 2: Data Types ======= =======
    Data types are divided into two groups:

        Primitive data types:
        - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types:
         - such as String, Arrays and Classes


            ---------- Primative Data Types ----------
    A primitive data type specifies the size and type of variable values, and it has no additional methods.


            byte
                - Stores whole numbers from -128 to 127
            short
                - Stores whole numbers from -32,768 to 32,767
            int
                - Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long
                - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float
                - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double
                - Stores fractional numbers. Sufficient for storing 15 decimal digits
            char
                - Stores a single character/letter or ASCII values
            boolean
                - stores boolean (T or F) value

             */

        System.out.println(" most used for numbers are int (for whole numbers) and double (for floating point numbers).");

        byte myByte = 127 ;
        System.out.println("myByte: " + myByte);

        short myShort = -32767;
        System.out.println("myShort: " + myShort * -1);

        int myInteger = 2147483647;
        System.out.println("myInteger: " + myInteger);

        long myLong =  15000000000L;
        System.out.println("myLong: " + myLong + "ends in L");

        float myFloat = 6.123f ;
        System.out.println("myFloat: " + myFloat + "ends in f");

        double myDouble = 12.56857341246382163532412387658123745812734d;
        System.out.println("myDouble: " + myDouble + "ends in d");

        boolean amIFemale = true;
        boolean datsNotTrue = false ;
        System.out.println(amIFemale);
        System.out.println(datsNotTrue);

        char myChar = 'C';
        System.out.println("myChar: " + myChar);

    /*
                ---------- Non-Primative [Reference] Data Types ----------

                Differences:
                  -  Primitive types are predefined (already defined) in Java.
                while Non-primitive types are created by the programmer and is not defined by Java (except for
                String).
                 -  Non-primitive types can be used to call methods to perform certain operations,
                 while primitive types cannot.
                 - A primitive type has always a value, while non-primitive types can be null
                 - A primitive type starts with a lowercase letter,
                 while non-primitive types starts with an uppercase
                  letter.
     */

//        Type Casting: converting a smaller type to a larger/smaller type size

        int byeInt = 8;
        double myNewDouble = byeInt ; // Automatic casting: int to double
        System.out.println("myNewDouble: " + myNewDouble);      // Outputs 9


//        Narrowing casting must be done manually
//        by placing the type in parentheses in front of the value:

        double byeDouble = 9.78;
        int myNewInt = (int) byeDouble; // Manual casting: double to int

        System.out.println("myDouble: " + myDouble);   // Outputs 9.78
        System.out.println("myNewInt: " + myNewInt);      // Outputs 9
    }
    static void operators_3() {
          /*
             ======= ======= 3: Operators ======= =======
        Operators are used to perform operations on variables and values.



            ---------- Arithmetic ----------
            +	Addition	Adds together two values
            -	Subtraction	Subtracts one value from another
            *	Multiplication	Multiplies two values
            /	Division	Divides one value by another
            %	Modulus	Returns the division remainder
            ++	Increment	Increases the value of a variable by 1
            --	Decrement	Decreases the value of a variable by 1

-           ---------Java Assignment Operators----------
            Assignment operators are used to assign values to variables.
            The addition assignment operator (+=) adds a value to a variable:
            Oper.     Ex.       Same As:
            =	    x = 5	    x = 5
            +=	    x += 3	    x = x + 3
            -=  	x -= 3	    x = x - 3
            *=	    x *= 3	    x = x * 3
            /=  	x /= 3	    x = x / 3
            %=	    x %= 3	    x = x % 3
            &=	    x &= 3  	x = x & 3
            |=	    x |= 3	    x = x | 3
            ^=	    x ^= 3	    x = x ^ 3
            >>=	    x >>= 3	    x = x >> 3
            <<=	    x <<= 3	    x = x << 3

           ---------Java Comparison Operators----------
           ==	    Equal to	    x == y
            !=	    Not equal	    x != y
            >	    Greater than	x > y
            <	    Less than	    x < y
            >=	  Greater than or equal to	x >= y
            <=	    Less than or equal to	  x <= y

            ---------Java Logical  Operators----------
            Logical operators are used to determine the logic between variables or values:
            && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
            || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
            !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

            ---------Java Bitwise  Operators----------

            Operator	            Description     	    Example     	        Same as	Result	                Decimal
        &	AND -    Sets each bit to 1 if both bits are 1	        5 & 1	        0101 & 0001 	0001	      1
        |	OR -     Sets each bit to 1 if any of the two bits is 1	    5 | 1	    0101 | 0001	    0101	    5
        ~	NOT -    Inverts all the bits	~ 5                     	 ~0101	        1010	                     10
        ^	XOR -    Sets each bit to 1 if only one of the two bits is 1	5 ^ 1	0101 ^ 0001 	0100	         4
                                                                                                                                D           Ex.         Same   D
        <<	Zero-fill left shift -   Shift left by pushing zeroes in from the right and letting the leftmost bits fall off  9 << 1	    1001 << 1	    0010	2
        >>	Signed right shift -     Shift right by pushing copies of the leftmost bit in from the left and letting the rightmost bits fall off	9 >> 1	1001 >> 1	1100	12
        >>>	Zero-fill right shift -  Shift right by pushing zeroes in from the left and letting the rightmost bits fall off	  9 >>> 1	     1001 >>> 1	   0100	4
             */
    }

    public static void main(String[] args) {
//        Any code inside the main() method will be executed.
        myFirstMethod_0();
        variables_1();
        dataTypes_2();
        operators_3();

    }
}






/*
             ======= ======= :  ======= =======
    Data types are divided into two groups:

        Primitive data types:
        - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types:
         - such as String, Arrays and Classes


            ----------  ----------

             */