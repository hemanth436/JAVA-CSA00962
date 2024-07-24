import java.util.*;
class composite
{
    public static void main(String args[])
    {
        int a=12,b=18;
        for(int i=a;i<b;i++)
        {
            for(int j=1;j<b/2;j++)
            {
                if(i%j==0)
                {
                    System.out.println(i);
                }
                else
                {
                   System.out.println("null");
                }
            }
        }
    }
}