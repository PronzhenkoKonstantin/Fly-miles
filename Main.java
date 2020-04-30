public class Main {
    public static void main(String args[]) {
        int payment = 1100;
        int bonus = payment / 100 * 1;
        int balance = 100;

        if (payment == 1000) {
            System.out.print(payment + balance);
        } else if (payment > 1000) {
            System.out.print(payment + bonus + balance);
        } else if (payment < 1000) {
            System.out.print(payment + balance);
        }
    }
}