class NestedTryCatchBlock {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];

            try {
                a[5] = 30 / 5;   // ArrayIndexOutOfBoundsException
            } 
            catch (ArithmeticException e) {
                System.out.println(e);
            }

            String s = null;
            System.out.println(s.length());   // NullPointerException

        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
