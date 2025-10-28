abstract class Bank {
    abstract int getIntrestRate();
}

class SBI extends Bank {
    int getIntrestRate() {
        return 8;
    }
}

class HDFC extends Bank {
    int getIntrestRate() {
        return 9;
    }
}

class BOD extends Bank {
    int getIntrestRate() {
        return 10;
    }
}

class TestAbstraction {
    public static void main(String args[]) {
        Bank b;

        b = new SBI();
        System.out.println("Rate of interest of SBI is: " + b.getIntrestRate() + "%");

        b = new HDFC();
        System.out.println("Rate of interest of HDFC is: " + b.getIntrestRate() + "%");

        b = new BOD();
        System.out.println("Rate of interest of BOD is: " + b.getIntrestRate() + "%");
    }
}
