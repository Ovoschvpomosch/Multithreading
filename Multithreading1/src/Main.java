import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Выберете номер задания");
            int opt=in.nextInt();
            switch (opt) {
                case (1):
                    System.out.println("Задание 1");
                    Thread_ Potok = new Thread_();
                    Potok.start();

                    break;
                case (2):
                    System.out.println("Задание 2");
                    Runnable_ myPotok = new Runnable_();
                    Thread myThread = new Thread(myPotok);
                    myThread.start();
                    break;
                case(3):
                    System.out.println(" ");
                    Thread timerThread = new Thread(new Timer());
                    Thread message5 = new Thread(new z3(5000));
                    Thread message7 = new Thread(new z3(7000));

                   timerThread.start();
                    message5.start();
                    message7.start();

                    break;
                default:
                    System.out.println("/╲/\\( •̀ ω •́ )/\\╱\\");
                    break;
            }
        }

    }
}