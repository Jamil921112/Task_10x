package ex_21_Exception;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankname) {
        if (bankname.currency.equalsIgnoreCase("INR")) {
            return bankname.amount + this.amount;

        } else {
            try {
                throw new Exception("Currency Mismatch, Can't proceed");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}
