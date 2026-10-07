public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All permutations of " + str + ":");
        generatePermutations(str, "");
    }
        public static void generatePermutations(String remaining, String current) { 
        if (remaining.length() == 0) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String rest = remaining.substring(0, i) + remaining.substring(i + 1);
            generatePermutations(rest, current + ch);
        }
    }
}
