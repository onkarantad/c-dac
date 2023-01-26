package loop;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n=0;
            boolean exit = false;

        while (!exit){
            System.out.println("-------------CHOICES------------");
            System.out.println("1 : Factorial");
            System.out.println("2 : Fibonacci number");
            System.out.println("3 : Prime or Not");
            System.out.println("4 : Palindrome");
            System.out.println("5 : String Reverse");
            System.out.println("6 : Swap without third variable");
            System.out.println("7 : vowel or not");
            System.out.println("8 : Check if a List of integers contains only odd numbers?");
            System.out.println("9 : Palindrome Check String");
            System.out.println("20 : exit" + "\n");



            System.out.print("enter choice : ");
            switch (sc.nextInt())
            {
                case 1:
                    System.out.println("============Factorial loop=============");
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int fact =1;
                    for (int i=n ; i>=1 ; i--)
                        fact = fact * i;
                    System.out.println("factorial of " +  n + " is : " + fact);
                    System.out.println("=========================");
                    break;
                case 2:
                    System.out.println("===========Fibonacci number loop==============");
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int a=0;
                    int b=1;
                    System.out.print(a+" ");
                    System.out.print(b+" ");
                    for (int i=0;i<n-2;i++){
                        int c = a  + b ;
                        System.out.print(c+ " ");
                        a=b;
                        b=c;
                    }
                    System.out.println("\n=========================");
                    break;
                case 3:
                    System.out.println("============Prime or Not=============");
                    boolean isPrime=true;
                    int count=0;
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    if(n<=1) isPrime=false;
//                    for (int i=2 ; i*i<=n ;i++)
                     for (int i=2 ; i<n ;i++)
                    {
                        count++;
                        if(n%i==0){
                            isPrime=false;
                            break;
                        }
                    }
                    System.out.println("isPrime : " + isPrime);
                    System.out.println("Count : " + count);
                    System.out.println("=========================");

                    // if number has no factor between 1 and sqRoot(number) then that is prime
                    //      i < sqroot(number)
                    //      i*i < number
                    break;
                case 4:
                    System.out.println("===========Palindrome==============");
                    boolean isPalindrome=false;
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int temp=n;
                    int reverse=0;
                    while (temp>0){
                        int last = temp%10;
                        reverse=reverse*10+last;
                        temp=temp/10;
                    }
                    if(n==reverse){
                        isPalindrome=true;
                        System.out.println(n + " isPalindrome : " + isPalindrome);
                    }else
                    System.out.println(n + " isPalindrome : " + isPalindrome);
                    System.out.println("=========================");
                    break;
                case 5:
                    System.out.println("reverse a String and enter string");
                    String str = sc.next();
                    StringBuilder out = new StringBuilder();
                    char[] chars = str.toCharArray();
                    for (int i = chars.length - 1; i >= 0; i--)
                        out.append(chars[i]);

                    System.out.print("str : " + str);
                    System.out.println();
                    System.out.print("out : " + out);
                    System.out.println();
                    break;

                case 6:

                    System.out.print("enter two numbers : ");
                    a=sc.nextInt();  // 3
                    b=sc.nextInt();  // 4
                    System.out.print("before Swap : " + a + b);
                    System.out.println();
//                    b = b + a;
//                    a = b - a;
//                    b = b - a;
                      b = b*a;
                      a = b/a;
                      b= b/a ;
                    System.out.print("after Swap : " + a + b);
                    System.out.println();

                    break;

                case 7:
                    System.out.print("enter string : ");
                    boolean vowelOrNot=false;
                    str = sc.next();
                    char[] ch = str.toCharArray();
                    for (int i=0 ; i< ch.length ; i++) {
                        if (
                                str.charAt(i) == 'A' || str.charAt(i) == 'a' ||
                                str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
                                str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
                                str.charAt(i) == 'O' || str.charAt(i) == 'o' ||
                                str.charAt(i) == 'U' || str.charAt(i) == 'u'    )
                            vowelOrNot = true;

                    }
                    System.out.println("vowelOrNot : " + vowelOrNot);
                    System.out.println("vowelOrNot : " + str.toLowerCase().matches(".*[a,e,i,o,u].*"));
                    break;

                case 8:
                    boolean oddOrNot=true;
                    System.out.print("enter size : ");
                    n=sc.nextInt();
                    List<Integer> list = new ArrayList<>();
                    System.out.print("Enter Numbers : ");
                    for (int i=0;i< n;i ++){
                        list.add(sc.nextInt());
                    }
                    for (int i : list) {
                        if (i % 2 == 0)
                            oddOrNot=false;
                    }
                    System.out.println("oddOrNot : " + oddOrNot);
                    break;

                case 9:
                    System.out.println("reverse a String and enter string");
                    boolean PalindromeOrNot=false;
                    str = sc.next();
                    String rev="";
                    int length = str.length();
                    for ( int i = length - 1; i >= 0; i-- ){
                        rev = rev + str.charAt(i);
                    }
                    if (str.equals(rev)){
                        PalindromeOrNot=true;
                    }
                    System.out.print("PalindromeOrNot : " + PalindromeOrNot);
                    System.out.println();
                    break;

                case 10:
                    break;

                case 20:
                    System.out.println("program is terminated !!!");
                    exit=true;
                    break;

            } //switchEnd
        } // whileEnd

        } //tryEnd
        catch (Exception e){
            e.printStackTrace();
        } //catchEnd

    } // MainEnd
} //ClassEnd
