package Products;

public class GlasHotDrink extends Product{
    private int volume;
    private String temperatur;
public GlasHotDrink(String name, Double price, int volume, String temperatur){
    super(name, price);
    this.volume = volume;
    this.temperatur = temperatur;
}
public int getVolume() {
    return volume;
}

public void setVolume(int volume) {
    this.volume = volume;
}

public String getTemperatur(){
    return temperatur;
}

public void setTemperatur(String temperatur){
    this.temperatur = temperatur; 
}

@Override
    public String toString(){
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume +
        ", temperatur=" + temperatur +
        '}';
    }

}

