public class Reversed {
        public static void main(String[] args) {
            String org = "indian flag";


            String reversed = new StringBuilder(org).reverse().toString();// Reversing the string


            String Uppercase = reversed.toUpperCase();// Converting the reversed string to uppercase

            // Printing the reversed string in uppercase
            System.out.println(Uppercase);
        }
    }
