
import java.math.BigDecimal;
import java.text.NumberFormat;

/*
 * Simple program to calculate compound interest using BigDecimal
 * From "Java How To Program, 10, Early Objects" - Chapter 8.
 */
public class BigDecimalInterest {

    public static void main(String[] args) {
        //Initial principal amount
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        //Interest rate
        BigDecimal rate = BigDecimal.valueOf(0.05);  
        BigDecimal amount;
        
        System.out.printf("%s%20s%n", "Year", "Amount");
        
        for (int i = 1; i < 11; i++) {
            amount = principal.multiply(rate.add(BigDecimal.ONE).pow(i));
            
            System.out.printf("%4d%20s%n", i,
                    NumberFormat.getCurrencyInstance().format(amount));
        }
    } //End main
    
} //End BigDecimalInterest
