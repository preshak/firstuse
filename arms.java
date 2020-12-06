import java.util.*;
public class arms {
    public static void main(String args[]) {
  Scanner n1=new Scanner(System.in);
  int n=n1.nextInt();
  for(int i=1;i<=n;i++){
      int temp,c=0,rem,sum=0;
      temp=i;
      for(int j=temp;j>0;j=j/10){
          c++;
      }
      for(int j=temp;j>0;j=j/10)
      {
          rem=j%10;
          sum=sum+(int)Math.pow(rem,c);
      }int z=10;
if(z++ <=10)
System.out.println("no.s that are armstrongs between 1 to "+n+":");
      if(temp==sum)
      System.out.println(sum);
  }
 System.out.println("these are your armstrong no");
    }
}