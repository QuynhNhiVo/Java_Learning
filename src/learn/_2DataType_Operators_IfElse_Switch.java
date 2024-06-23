package learn;

import java.util.Scanner;

public class _2DataType_Operators_IfElse_Switch {
    public static void main(String[] args) {
        ///////////////DATA TYPES/////////////////////
//        System.out.println("1. Data Types");
//        System.out.println(" Primitive data types (dữ liệu nguyên thủy), bao gồm: byte, short, int, long, float, double, boolean, char\n"+
//            " Non-primitive data types : String, Arrays and Classes\n" +
//            " Java number: \n" +
//            " - Integer Types: lưu trữ số nguyên, bao gồm: byte, short, int và long\n" +
//            "  byte \n" +
//            "  short \n" +
//            "  int \n" +
//            "  Long: long num = 15000000L\n" +
//            " - Float point types: lưu trữ số thực, bao gồm: float, double" +
//            "  float: float num = 5.2f\n" +
//            "  double: double num = 15.54d\n" +
//            " boolean \n" +
//            " char \n"  +
//            " String");


        ///////////////OPERATORS/////////////////////
//        System.out.println("\n2. Operators");
//        System.out.println(" - Arithmetic Operators \n" +
//            " +, -, *, /, %, ++, --\n" +
//            " - Compare \n" +
//            " ==, !=, >, >=, <, <=\n"+
//            " - Logic \n" +
//            " &&, ||, !");


        //////////////IF.....ELSE///////////////
        System.out.println("\n3. If..else");
        System.out.println(" if(condition){\n"+
            "     // value reture of c1 (TRUE)\n" +
            "     }else if(condition2){\n" +
            "     // value reture of c2 (TRUE)\n" +
            "     }else{\n" +
            "     // ....(FALSE)}");
        System.out.println("Example");
        System.out.println("        if(tax<10){\n" +
            "            System.out.println(\" <10 \");\n" +
            "        } else if (10<=tax && tax<=15) {\n" +
            "            System.out.println(\" [10, 15] \");\n" +
            "        }else if (15<tax && tax<=30){\n" +
            "            System.out.println(\" (15, 30] \");\n" +
            "        }else {\n" +
            "            System.out.println(\" >30\");\n" +
            "        }");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tax: ");
        int tax = scanner.nextInt();
        if(tax<10){
            System.out.println(" <10 ");
        } else if (10<=tax && tax<=15) {
            System.out.println(" [10, 15] ");
        }else if (15<tax && tax<=30){
            System.out.println(" (15, 30] ");
        }else {
            System.out.println(" >30");
        }
        System.out.println("");


        //////////////SWITCH///////////////
        System.out.println("\n4. Switch");
        System.out.println(" switch(expression) {\n" +
            "   case x:\n" +
            "    // code block\n" +
            "    break;\n" +
            "   case y:\n" +
            "    // code block\n" +
            "    break;\n" +
            "   default:\n" +
            "    // code block\n" +
            "}");
    }
}
