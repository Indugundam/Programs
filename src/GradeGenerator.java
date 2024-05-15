import java.util.Scanner;
class GradeGenerator
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of subjects:");
    int n=sc.nextInt();
    int sub[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter the marks in subject" +(i+1)+ ":");
        sub[i]=sc.nextInt();
        sum+=sub[i];
    }
    int percentage=sum/n;
    System.out.println("Total marks= "+sum);
    System.out.println("Average percentage= "+percentage+"%");
    if (percentage > 90 && percentage < 100)
        System.out.println("You got 'A' grade");
    else if (percentage > 80 && percentage < 90)
        System.out.println("You got 'B' grade");
    else if(percentage > 70 && percentage < 80)
        System.out.println("You got 'C' grade");
    else if (percentage > 60 && percentage < 70)
        System.out.println("You got 'D' grade");
    else
        System.out.println("You have Failed");
}
}