class factorial
{
    public static void main(String arg[])
    {
        int n=6,fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}