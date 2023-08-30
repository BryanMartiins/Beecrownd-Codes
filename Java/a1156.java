import java.util.Locale;

public class a1156 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float S = 1, K, i = 1;
        for (K=3; K <= 39; K+=2) {
            
            S += K / (i*2);
            i*=2;    
         
        }
      
        System.out.printf("%.2f\n", S);

    }
}