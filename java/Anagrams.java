public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "nestiler";

        Boolean Anagrams = checkIfAnagrams(str1, str2);

        if (Anagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean checkIfAnagrams(String str1, String str2) {


        return true;
    }
}




            /*char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            return Arrays.equals(charArray1, charArray2);*/








