package CalculationAverage;

public class Main {
    public static void main(String[] args){
        
        int[] liste = new int[]{1,2,3,4,5,6};
        double average = 0.0;
        double sum=0;

        for(int i=0; i<liste.length; i++){
            sum += liste[i];
        }

        average = sum / liste.length;
        
        System.out.println(average);

        HarmonicOrta har = new HarmonicOrta();
        System.out.println(har.harmonicOrta(liste));

    }
    
}
