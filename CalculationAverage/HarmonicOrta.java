package CalculationAverage;

public class HarmonicOrta {
    
    double harmonicOrta(int[] liste){
        
        double sum =0.0;
        double harOrta;
        
        for(int i=0; i<liste.length; i++){
            sum+= (1/liste[i]);
        }

        harOrta = (liste.length)/sum;
        
        return harOrta;
    }


}
