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
        System.out.println("Доброго времени суток!!! Пожалуста,ознакомтесь с меню");
        Scanner sc = new Scanner(System.in);
        int menuOption = 0;
        while (menuOption != 4) {
            System.out.println("1. - Добавить задание");
            System.out.println("2. - Выбрать и изменить задание");
            System.out.println("3.  - Отобразить задание");
            System.out.println("4.  - Выход");
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
                        System.out.println("Выберите период");
                        System.out.println("1. - на сегодня");
                        System.out.println("2. - на выбранную дату");
                        System.out.println("3. - на неделю ");
                        System.out.println("4. - весь список ");
                        System.out.println("5. - назад ");
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
                                System.out.println("неверный ввод");
                        }
                        break;
                    }

                case 4:
                    break;
                default:
                    System.out.println("неверный ввод");


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