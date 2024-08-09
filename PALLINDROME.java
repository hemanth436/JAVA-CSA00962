import java.util.*;
class Pallindrome{
    public static void main(String args[])
    {
        String s="hemanth";
        String r=s;
        for(int i=s.lenth();i>=0;i--)
        {
            if(i==r)
            {
                System.out.println("given string is pallindrome string.");
            }
            else
            {
                System.out.println("given string is not a pallindrome string");
            }
        }
    }
}