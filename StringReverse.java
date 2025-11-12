public class StringReverse {
    public static void main(String[] args) {
        java.lang.StringBuffer sb1 = new java.lang.StringBuffer(10);
        sb1.append("Welcome to fct dear all");
        System.out.println("Length: " + sb1.length());
        System.out.println("Reverse String: " + sb1.reverse());
        System.out.println("Character at Specific Index: " + sb1.charAt(5));
        sb1.setCharAt(5, 'M');
        System.out.println("Add Character at specific index: " + sb1);
        System.out.println("Delete Char at: " + sb1.deleteCharAt(5));
        System.out.println("Index of f: " + sb1.indexOf("f"));
        System.out.println("Is empty: " + (sb1.length() == 0));
        System.out.println("Hashcode: " + sb1.hashCode());
        System.out.println("Substring: " + sb1.substring(3, 7));
        System.out.println("String Class: " + sb1.getClass());
    }
}