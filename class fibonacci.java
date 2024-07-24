class fibonacci
{
    public static void main(String arg[])
    {
        int n=5;
        int a,b,c=0;
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n;i++)
        {
        c=a+b;
        a=b;
        b=c;
        System.out.println(b);
        }
    }
}