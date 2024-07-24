class vote
{
    public static void main(String args[])
    {
        int age=15;
        if(age>=18)
        {
            System.out.println("you are eligible to vote");
        }
        else
        {
            int diff=18-age;
            System.out.println("you are allowed to vote after "+diff );
            System.out.print("years");
        }
    }
}