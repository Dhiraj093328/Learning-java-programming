class ATM {

    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println(a1.viewBalance());
        System.out.println("My current Balance is: " + a1.depositBal(100000));
        System.out.println("Your available Balance after withdraw is: " + a1.withdrawBal(15000));
    }
}
