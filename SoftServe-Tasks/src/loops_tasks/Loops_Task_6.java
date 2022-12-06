import java.util.Scanner;

public class Loops_Task_6 {
//    6. After starting training, the athlete ran n km on the first day. On each of
//    the following days, he increased the daily rate by 10% from the previous
//    day's rate. Determine: the number of days k 1 after the start of training,
//    when the athlete will run more than 20 km per day; the number of days k
//    2 after the start of training, when his total distance will be greater than
//    100 km.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //k1 is 20km per day;
        int k1 = 1;

        //k2 is distance to reach 100km;
        int k2 = 1;

        double firstDayDistance = scanner.nextDouble();

        double totalDistance = firstDayDistance;
        double currentDayDistance = firstDayDistance;
        double daysRate = (10 * currentDayDistance) / 100;

        do{
            currentDayDistance = currentDayDistance + daysRate;
            daysRate = (10 * currentDayDistance) / 100;

            if (currentDayDistance <= 20){
                k1++;
            }

            totalDistance += currentDayDistance;
            k2++;

        }while(totalDistance <= 100 || currentDayDistance <= 20);


        System.out.println(k1);
        System.out.println(k2);
    }
}
