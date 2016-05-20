import java.util.Date;

/**
 * Created by henriettebarchager on 20/05/2016.
 */
public class Invoice {

    private int invoiceId;
    private Date sendDate, payDate;
    private boolean inOrOut;
    private double priceNoVat, vat, totalPrice;

    Case c = new Case;
    Company company = new Company;
    Alutec alutec = new Alutec;

    public Invoice(Date sendDate, Date payDate, boolean inOrOut, double priceNoVat, double vat, double totalPrice, Case c, Company company, Alutec alutec) {
        this.sendDate = sendDate;
        this.payDate = payDate;
        this.inOrOut = inOrOut;
        this.priceNoVat = priceNoVat;
        this.vat = vat;
        this.totalPrice = totalPrice;
        this.company = company;
        this.alutec = alutec;
        this.c = c;
    }

    public Invoice(int invoiceId, Date sendDate, Date payDate, boolean inOrOut, double priceNoVat, double vat, double totalPrice, Case c, Company company, Alutec alutec) {
        this.invoiceId = invoiceId;
        this.sendDate = sendDate;
        this.payDate = payDate;
        this.inOrOut = inOrOut;
        this.priceNoVat = priceNoVat;
        this.vat = vat;
        this.totalPrice = totalPrice;
        this.company = company;
        this.alutec = alutec;
        this.c = c;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public boolean isInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(boolean inOrOut) {
        this.inOrOut = inOrOut;
    }

    public double getPriceNoVat() {
        return priceNoVat;
    }

    public void setPriceNoVat(double priceNoVat) {
        this.priceNoVat = priceNoVat;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Alutec getAlutec() {
        return alutec;
    }

    public void setAlutec(Alutec alutec) {
        this.alutec = alutec;
    }

    public Case getC() {
        return c;
    }

    public void setC(Case c) {
        this.c = c;
    }
}
