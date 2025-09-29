class TrafficLight {

    public static void main(String[] args) {

        String color = "Yellow";  

        if (color=="Red") {
            System.out.println("STOP");
        } else if (color=="Yellow") {
            System.out.println("READY");
        } else if (color=="Green") {
            System.out.println("GO");
        } else {
            System.out.println("Invalid colour");
        }
    }
}
