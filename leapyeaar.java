import java.util.*;
class leapyear
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int year;
        Sysyem.out.println("enter the year");
        year=sc.nextInt();
        if(year%4==0)
        Sysyem.out.println("it is a leap year");
        else
        Sysyem.out.println("it is not a leap year ");
    }
}