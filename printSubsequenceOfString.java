public class printSubsequence {

    public static void printSubsequence(String str, String output, int i) {
        // Base condition
        if (i >= str.length()) {
            System.out.println(output);
            return;
        }

        // Exclude the current character
        printSubsequence(str, output, i + 1);

        // Include the current character
        printSubsequence(str, output + str.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String output = " ";
        int i = 0;
        printSubsequence(str, output, i);
    }
