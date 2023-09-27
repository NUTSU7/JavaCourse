package automobil;

public class Automobil {
    int anProd;
    String model;
    String seria; 

    public int getAnProd() {
        return anProd;
    }

    public String getModel() {
        return model;
    }

    public String getSeria() {
        return seria;
    }

    public void setData(int x, String y, String z) {
        anProd = x;
        model = y;
        seria = z;
    }
}
