package strings;

//== vs equals vs equalIngnoreCase;
public class Test2 {
public static void main(String[] args) {
String s1= new String("hello");
String s2= new String("HELLO");
String s3= new String("hello");
System.out.println(s1==s2);//f
System.out.println(s1.equals(s2));//f
System.out.println(s1.equalsIgnoreCase(s2));//t
System.out.println(s1==s3);//f
System.out.println(s1.equals(s3));//t


 
        System.out.println("Try programiz.pro");
      int n = 10;
      int sumEven =0;
      int sumOdd=0;
      for(int i=0;i<=n;i=i+2){
          sumEven+=i;
      }
       for(int i=1;i<=n;i=i+2){
          sumOdd+=i;
      }
      System.out.println(sumEven+" "+sumOdd);
    }
}