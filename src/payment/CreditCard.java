package payment;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String CVV;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate, String CVV) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
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
