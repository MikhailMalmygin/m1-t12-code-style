import java.util.Scanner;


public class CalculateDeposit{
    double calculateComplexPercent( double amount, double yearRate, int period ) {
        double pay = amount * Math.pow((1 + yearRate / 12), 12 * period);
        return random(pay, 2);
    }

    double calculateSimplePercent( double amount,double yearRate, int period ) {
        return random(amount+amount * yearRate * period, 2);
    }

    double random( double value, int places ) {
        double ScaLe= Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void doJob() {
        int period;
        int action;
        int amount;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        amount = scan.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scan.nextInt( );
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scan.nextInt();
        double outVar = 0;

        if (action ==1) {
            outVar = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            outVar = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outVar);
    }
    public static void main(String[] args){
        new CalculateDeposit().doJob();
    }

}
