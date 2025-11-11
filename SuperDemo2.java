//Super Keyword :
//1.Access Parent Class Variable
//2.Access Parent Class Method
//3.Access Parent Class

class Parent {
    String message = "Happy Diwali";
}

class SuperDemo extends Parent {
    public static void main(String[] args) {
        SuperDemo d1 = new SuperDemo();
        System.out.print(d1.message);
    }
}
