class ThrowDemo
{
    public static void validate(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException("This person is not allowed to vote");
        }
        else
        {
            System.out.println("Validate for voting");
        }
    }

    public static void main(String Args[])
    {
        try{
            validate(14);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Reset of the code....");
    }
}
