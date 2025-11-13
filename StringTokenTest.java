import java.util.StringTokenizer;

class StringTokenTest {
    public static void main(String args[]) {
        String s1 = "Have a nice day dear all";
        String s2 = "Have,a,nice,day,dear,all";

        // Tokenizer using default delimiter (space)
        StringTokenizer st1 = new StringTokenizer(s1);
        System.out.println("Tokens from s1:");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        // Tokenizer using custom delimiter (comma)
        StringTokenizer st2 = new StringTokenizer(s2, ",");
        System.out.println("\nTokens from s2:");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
