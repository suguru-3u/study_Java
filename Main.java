/*
/?@Java??w?K
/  ?w?K??2020/11/10
*/

public class Main{
    public static void main(String[] args){
        // System.out.println("Hello world");
        // final String japanString = "����ɂ���I";
        // System.out.println(japanString);
        // String japanLangage = "aaa";
        // System.out.println(japanLangage);
        // int a = 4;
        // int b = 5;
        // int c = a + b;
        // System.out.println(c);
        // int age = (int)3.2;
        // System.out.println(age);
        // String msg = "���̖��O��" + 23 ;
        // System.out.println(msg);
        // int m = Math.max(a,b);
        // System.out.println(m);
        // int r = new java.util.Random().nextInt(100);
        // System.out.println(r);
        // System.out.println("���Ȃ��̖��O����͂��Ă�������");
        // String name = new java.util.Scanner(System.in).nextLine();
        // System.out.println(name);
        
        // 2�͂̉ۑ�
        // System.out.println("�悤�����肢�̊قցI�I�I");
        // System.out.println("���Ȃ��̖��O����͂��Ă�������");
        // String name = new java.util.Scanner(System.in).nextLine();
        // System.out.println("���Ȃ��̔N�����͂��Ă�������");
        // String ageString = new java.util.Scanner(System.in).nextLine();
        // int age = Integer.parseInt(ageString);
        // int fortune = new java.util.Random().nextInt(4);
        // fortune++;
        // System.out.println("�肢�̌��ʂ��o�܂����I");
        // System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
        // System.out.println("�P�F��g�@�Q�F���g�@�R�F�g�@�S�F��");

        // 3�̓X�^�[�g
        // boolean tenki = true;
        // if(tenki){
        //     System.out.println("�I�����܂�");
        // }else{
        //     System.out.println("DVD���݂܂�");
        // }

        // int count = 0;
        // while(tenki){
        //     System.out.println("�I�����܂�");
        //     count++;
        //     if(count > 5){
        //         tenki = false;
        //     }
        // }

        // String a = "aaa";
        // if(a.equals("aaa")){
        //     System.out.println("������̕]������");
        // }

        // switch(count){
        //     case 0:
        //         System.out.println("0�ł��I");
        //         break;
        //     case 1:
        //         System.out.println("1�ł��I");
        //         break;
        //     default:
        //     System.out.println("�悭�킩��Ȃ�");
        // }

        // for(int i = 0 ; i < 10 ; i++){
        //     System.out.println("����ɂ���I");
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