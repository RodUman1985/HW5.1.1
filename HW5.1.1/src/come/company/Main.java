package come.company;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        /*File f = new File("1.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileReader f=new FileReader("1.txt");
        } catch (FileNotFoundException e) {
            try {
                FileWriter f=new FileWriter("1.txt");
                f.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }*/



        Instruments n = new Instruments();
        n.loadFromFile();
        System.out.println("������� ������� �����!!! ���������,����������� � ����");
        Scanner sc = new Scanner(System.in);
        int menuOption = 0;
        while (menuOption != 4) {
            System.out.println("1. - �������� �������");
            System.out.println("2. - ������� � �������� �������");
            System.out.println("3.  - ���������� �������");
            System.out.println("4.  - �����");
            menuOption = sc.nextInt();
            switch (menuOption) {
                case 1:
                   n.addToList();
                    break;
                case 2:
                    n.changeDealls();
                    break;
                case 3:


                    int mO = 0;
                    while (mO != 5) {
                        System.out.println("�������� ������");
                        System.out.println("1. - �� �������");
                        System.out.println("2. - �� ��������� ����");
                        System.out.println("3. - �� ������ ");
                        System.out.println("4. - ���� ������ ");
                        System.out.println("5. - ����� ");
                        menuOption = sc.nextInt();
                        switch (menuOption) {
                            case 1:
                            n.dealsOnThisDay();
                                break;
                            case 2:
                            n.seeOne();
                                break;
                            case 3:
                                n.dealsOnThisWeak();
                                break;
                            case 4:
                                n.seeAll();
                                break;
                            case 5:

                                break;
                            default:
                                System.out.println("�������� ����");
                        }
                        break;
                    }

                case 4:
                    break;
                default:
                    System.out.println("�������� ����");


            }
        }

     /*   n.addToList();
        n.seeAll();*/
      //  System.out.println(n.deals);
         //  n.seeOne();
         // n.dealsOnThisDay();
         // n.dealsOnThisWeak();
       // n.changeDealls();
       // n.seeOne();

    }
}