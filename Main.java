import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a button (1-espresso, 2-americano, 3-cappuccino, 4-tea");
        int choice = sc.nextInt();
        sc.close();
// todo
      /*  if (choice == 1) {
            System.out.println("Your selection is espresso");
            System.out.println(getEspresso() + "\n" + getFinalMessage());
        } else if (choice == 2) {
            System.out.println("Your selection is americano");
            System.out.println(getAmericano());
        } else if (choice == 3) {
            System.out.println("Your selection is cappuccino");
            System.out.println(getCappuccino());
        } else if (choice == 4) {
            System.out.println("Your selection is tea");
            System.out.println(getTea());
        } else {
            System.out.println("error");
        }*/


        switch (choice) {
            case 1:
                System.out.println("Your selection is espresso");
                System.out.println(getEspresso() + "\n" + getFinalMessage());
                break;
            case 2:
                System.out.println("Your selection is americano");
                System.out.println(getAmericano() + "\n" + getFinalMessage());
                break;
            case 3:
                System.out.println("Your selection is cappuccino");
                System.out.println(getCappuccino() + "\n" + getFinalMessage());
                break;
            case 4:
                System.out.println("Your selection is tea");
                System.out.println(getTea());
                break;
            default:
                System.out.println("error");
                break;
        }
    }
    public static String getEspresso() {
        return "Espresso";
    }

    public static String getAmericano() {
        return "Americano";
    }

    public static String getCappuccino() {
        return "Cappucino";
    }

    public static String getTea() {
        return "Tea";
    }

    public static String getFinalMessage() {
        return "is ready";
    }
    }





