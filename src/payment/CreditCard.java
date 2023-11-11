package payment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.SecureRandom;

public class CreditCard {

    private static final Logger logger = LogManager.getLogger(CreditCard.class);

    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private final String CVV;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.CVV = generateRandomCVV();
    }

    private String generateRandomCVV() {
        SecureRandom random = new SecureRandom();
        int cvvNumber = random.nextInt(900) + 100; // makes sure CVV is 3 digits
        return String.format("%03d", cvvNumber); // ensures leading zeros are included
    }

    public String getCVV() {
        return CVV;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber:'" + cardNumber + '\'' +
                ", cardHolderName:'" + cardHolderName + '\'' +
                ", expirationDate:'" + expirationDate + '\'' +
                '}';
    }
}