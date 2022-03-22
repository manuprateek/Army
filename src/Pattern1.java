import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the star value");
        int star=in.nextInt();
        int space=star-1;
        int starcount=1;
        for (int i =0;i<star;i++)
            {
                for(int j=1;j<=space;j++)
                {
                    System.out.println(" ");
                }
                for(int k=1;k<=starcount;k++)
                {
                    System.out.println("*");
                }
                space--;
                starcount++;
                System.out.println();
            }
    }
}
