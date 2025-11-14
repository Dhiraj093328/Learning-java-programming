class MultipleCatchBlock {

    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[4] = 30 / 5;   // ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
