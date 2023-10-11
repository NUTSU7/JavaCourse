public class Invoice {
    private String model, desc;
    private int quant;
    private double price;

    public Invoice(String model, String desc, int quant, double price) {
        this.model = model;
        this.desc = desc;
        if (checkVar(quant))
            this.quant = quant;
        else
            this.quant = 0;
        
        if (checkVar((int) price))
            this.price = price;
        else
            this.price = 0.0;
        
    }

    public String getModel() {
        return model;
    }
    
    public String getDesc() {
        return desc;
    }

    public int getQuant() {
        return quant;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQuant(int quant) {
        if (checkVar(quant))
            this.quant = quant;
        else
            this.quant = 0;
    }

    public void setPrice(double price) {
        if (checkVar((int)price))
            this.price = price;
        else
            this.price = 0.0;
    }

    private boolean checkVar(int x) {
        if (x < 0)
            return false;
        return true;
    }

    public double getAmount() {
        return (double) quant * price;
    }
}
