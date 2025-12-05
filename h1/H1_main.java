package h1;

public class H1_main {

    public static void main(String[] args) {
    
        Zahl meineZahl = new Zahl();

        meineZahl.num = 80;

        meineZahl.setEven();
        meineZahl.setPositive();
        meineZahl.setSmall();

        System.out.println("Zahl: " + meineZahl.num);
        System.out.println("Gerade (even): " + meineZahl.even);
        System.out.println("Positiv (positive): " + meineZahl.positive);
        System.out.println("Klein (small): " + meineZahl.small);
    }
}
