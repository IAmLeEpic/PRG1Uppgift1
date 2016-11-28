import javax.swing.*;

/**
 * Created by sjjo15 on 2016-11-28.
 */
public class PRG1Uppgifter {
    public static void main(String[] args) {
        del1();
        del2();
    }

   public static void del1(){

        String numbers = "";
        int rows = 9;

        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++)
                numbers = numbers + " " + i*j;
            numbers = numbers + '\n';
        }
            JOptionPane.showMessageDialog(null,  numbers);
    }

    public static void del2(){

        int nämnare = 1;
        double kvot = 1;
        double summa = 1;

        while (kvot >= 0.00001) {
            nämnare = nämnare + 1;
            kvot = 1.0/nämnare;

            if (nämnare % 2 == 0) {
                summa = summa - kvot;
            } else if (nämnare % 2 != 0){
                summa = summa + kvot;
            }

        }
        JOptionPane.showMessageDialog(null, summa);
    }
}
