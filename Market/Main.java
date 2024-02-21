package Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Jack");
        Human human2 = new Human("Sam");
        Human human3 = new Human("Den");

        Scanner in = new Scanner(System.in);
        System.out.println("Открыть магазин? Нажмите 1, чтобы открыть ");
        int openMarket = in.nextInt();
        if (openMarket == 1) {
            market.acceptToMarket(human1);
            market.acceptToMarket(human2);
            market.acceptToMarket(human3);
            market.update();
        } else {
            System.out.println("Потом откроемся");
        }
    }
}
