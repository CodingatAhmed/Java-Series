import java.util.Arrays;


public class JavaDataTypes {
    public static class Vehicle {
        //      Declaring the attributes(variables) we are about to use in this class(Vehicle)
        final String VehicleName;
        final float MaxSpeed;
        final String Color;

        Vehicle(String VehicleName, float MaxSpeed, String Color) {
//      here this keyword refers to current instance(object) having properties. for example here this.VehicleName
//      relates to the usage of VehicleName attribute for the current instance(object) we are creating. This means
//      that with the usage of constructor we may assign different values for each unique object we are creating
            this.VehicleName = VehicleName;
            this.MaxSpeed = MaxSpeed;
            this.Color = Color;
        }
    }

    public static void main(String[] args) {

//      Without declaration, you can not use any variable, and data type definition is a part of declaration itself

//      There are two categories of data types: Primitive & Non-Primitives(Reference)

//      Primitive Data Type: These are built-in datatypes of java, handling with simple data values. each type hold
//      a fixed size and are stored directly in memory.

//      Non-Primitive Data Type: These datatypes hold reference to objects, arrays and other complex structures. It
//      includes Strings, arrays and other user-defined objects. They do not directly store the actual data but
//      point to the memory location where the data is stored.

//      Different Primitive Data Types used in Java:
//      1) byte Data Type: This Data Type stores integer values and allocates memory of 1 byte,
//      can store values b/w -128 to 127, you cannot assign decimal numbers as it triggers an error

        byte Number = 50;  //Valid Example
        System.out.println(Number);     //Outputs 50
//
//      An invalid example for byte data type usage
//      byte Num = 129;   This may occur an error as it stores a value out of range

//      2) short Data Type: This Data Type stores integer values and allocates memory of 2 bytes,
//      can store values b/w -32,768 to 32,767, you cannot assign decimal numbers as it triggers an error

        short MyNumber = 20;
        System.out.println(MyNumber);   //Outputs 20

//      3) int Data Type: This Data Type stores integer values and allocates memory of 4 bytes,
//      can store values b/w -2^31 to 2^(31-1), you cannot assign decimal numbers as it triggers an error

        int newNumber = 500;
        System.out.println(newNumber);   //Outputs 500

//      4) long Data Type: This Data Type stores integer values and allocates memory
//      of 8 bytes, can store values b/w -2^63 to 2^63-1,used for large integers
//      you cannot assign decimal numbers as it triggers an error

        long longNumber = 500000000000L;  //(L is required for large numbers else not needed)
        System.out.println(longNumber);   //Outputs 500000000000

//      5) float Data Type: This Data Type stores decimal values and allocates memory
//      of 4 bytes, can store values b/w ±1.4E-45 to ±3.4E38, used for less precise floating point numbers

        float floatNumber = 50.20002892849198948f;  //(f is required only for decimal/float literals)
        System.out.println(floatNumber);   //Outputs 50.200027

        float newfloatNumber = 30;  //(f is required only for decimal/float literals)
        System.out.println(newfloatNumber);   //Outputs 30.0

//      6) double Data Type: This Data Type works exactly works like float type but stores extra precision decimal
//      values, allocates memory of 8 bytes, can store values b/w ±4.9E-324 to ±1.8E308,
//      used for large integers, you cannot assign decimal numbers as it triggers an error

        double doubleNum = 1.2222220802891892198391;  //(L is required only for large integers)
        System.out.println(doubleNum);   //Outputs 1.2222220802891892

        double newDoubleNum = 1222222080008L;  //(L is required only for large integers)
        System.out.println(newDoubleNum);   //Outputs 1.222222080008E12 where E is exponent

//      7) char Data Type: This Data Type stores single character(alphabet or symbol) within single inverted commas(''),
//      allocates memory of 2 bytes, can store values b/w 0 to 65535 (in Unicode range).

        char myChar = 'A';  //Valid Example
        System.out.println(myChar);   //Outputs 'A'

        char newChar = '#';  //Still a valid example
        System.out.println(newChar);   //Outputs '#'

//      8) Boolean Data Type: This Data Type stores either true or false, allocates memory of 1 byte.

        boolean isAdult = true;  // Valid Example
        System.out.println(isAdult);   //Outputs true

        boolean isFree = false;  //Still a valid example
        System.out.println(isFree);   //Outputs false

//      Different Non-Primitive Data Types used in Java:
//      1) String Data Type: This Data Type stores a sequence of individual characters under a pair of double-inverted
//      commas and is allocated a variable size (based on length of string), it is Immutable, meaning once a string
//      object is created, its value cannot be changed.

        String myName = "Ahmed Abdul Rehman";
        System.out.println(myName);     //Outputs "Ahmed Abdul Rehman"

//      2) Array Data Type: This Data Type acts as a container which stores fixed number of values of same
//      data type (be it any object, string, or any primitive data type

//      under a pair of curly brackets. It is allocated a variable size (based on number of values stored in array),
//      can be 1-Dimensional or Multi-Dimensional.

        int[] myArray = {9, 7, 9, 79, 494};
        System.out.println(myArray);     //Outputs the memory location to where array is stored i.e [I@6acbcfc0
        System.out.println(Arrays.toString(myArray));    //Outputs the values stored in array with the usage of
        // java Arrays library i.e 'java.util.Arrays'

        System.out.println("First Number is " + myArray[0]); //Outputs First Number is 8

//      3) Class & Objects: This Data Type creates classes, and hence creates instances(objects) based on that class.
//      classes can include attributes (variables) & methods (functions) to define data and behaviours. It holds a
//      variable size depending upon the class and number of properties (attributes & methods) it stores.

//      Vehicle class is created above and an object is being created here.
        Vehicle myCar = new Vehicle("Corolla", 270, "Black");
        System.out.println(myCar.MaxSpeed); //Outputs 270.0

//      4) Interfaces: This Data Type creates classes, in fact they are identical to classes,
//      but cannot create instances(objects) however interfaces are designed to implement it into classes.
        interface bodyStyle {
            final String bodyType = "";
            public void SetBodyType();
        }
//      5) Enum: This Data Type defines a set of constants, which are reference types, Useful for defining a set
//      of predefined values. Its size varies depending upon num of values within an enum set.
        enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
        Day today = Day.MONDAY; // Enums are reference types
        System.out.println(today);  //Outputs Monday
    }

}