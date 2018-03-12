package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Wooooop {

    public static void main(String[] args) {

        test("Hey,", " this", " is", " a", " test.");
        test("Whoopdee", " woop", " woooooop!");
        test("No", " soup", " for", " you.");

        System.out.println();

    }

    public static void test(String ... varargs){

        StringBuilder sb = new StringBuilder();
        System.out.println();

        for (int i = 0; i < varargs.length; i++){

            sb.append(varargs[i]);
            if (i == varargs.length - 1) System.out.print(sb);
        }

    }
}


