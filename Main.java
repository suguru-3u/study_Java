/*
/?@Java??w?K
/  ?w?K??2020/11/10
*/

public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        final String japanString = "こんにちわ！";
        System.out.println(japanString);
        String japanLangage = "aaa";
        System.out.println(japanLangage);
        int a = 4;
        int b = 5;
        int c = a + b;
        System.out.println(c);
        int age = (int)3.2;
        System.out.println(age);
        String msg = "私の名前は" + 23 ;
        System.out.println(msg);
        int m = Math.max(a,b);
        System.out.println(m);
        int r = new java.util.Random().nextInt(100);
        System.out.println(r);
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println(name);
    }
}