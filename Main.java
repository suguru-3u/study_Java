/*
/?@Java??w?K
/  ?w?K??2020/11/10
*/

public class Main{
    public static void main(String[] args){
        // System.out.println("Hello world");
        // final String japanString = "こんにちわ！";
        // System.out.println(japanString);
        // String japanLangage = "aaa";
        // System.out.println(japanLangage);
        // int a = 4;
        // int b = 5;
        // int c = a + b;
        // System.out.println(c);
        // int age = (int)3.2;
        // System.out.println(age);
        // String msg = "私の名前は" + 23 ;
        // System.out.println(msg);
        // int m = Math.max(a,b);
        // System.out.println(m);
        // int r = new java.util.Random().nextInt(100);
        // System.out.println(r);
        // System.out.println("あなたの名前を入力してください");
        // String name = new java.util.Scanner(System.in).nextLine();
        // System.out.println(name);
        
        // 2章の課題
        // System.out.println("ようこそ占いの館へ！！！");
        // System.out.println("あなたの名前を入力してください");
        // String name = new java.util.Scanner(System.in).nextLine();
        // System.out.println("あなたの年齢を入力してください");
        // String ageString = new java.util.Scanner(System.in).nextLine();
        // int age = Integer.parseInt(ageString);
        // int fortune = new java.util.Random().nextInt(4);
        // fortune++;
        // System.out.println("占いの結果が出ました！");
        // System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        // System.out.println("１：大吉　２：中吉　３：吉　４：凶");

        // 3章スタート
        // boolean tenki = true;
        // if(tenki){
        //     System.out.println("選択します");
        // }else{
        //     System.out.println("DVDをみます");
        // }

        // int count = 0;
        // while(tenki){
        //     System.out.println("選択します");
        //     count++;
        //     if(count > 5){
        //         tenki = false;
        //     }
        // }

        // String a = "aaa";
        // if(a.equals("aaa")){
        //     System.out.println("文字列の評価成功");
        // }

        // switch(count){
        //     case 0:
        //         System.out.println("0です！");
        //         break;
        //     case 1:
        //         System.out.println("1です！");
        //         break;
        //     default:
        //     System.out.println("よくわからない");
        // }

        // for(int i = 0 ; i < 10 ; i++){
        //     System.out.println("こんにちわ！");
        // }

        for(int i = 1 ; i < 10 ; i++){
            if(i == 2){
                continue;
            }
            if(i == 4){
                break;
            }
            for(int j = 1 ; j < 10 ; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}