package Products;


/**Базовый класс продукта  */

public class Product {
    /**Наименование продукта */
    private String name; 
    /**Цена продукта */
    private Double price;
    /**
     * Конструктор продукта 2 параметра
     * @param name наименование продукта
     * @param price цена продукта
     */
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
     /** получаем наименование продукта */
     public String getName(){ 
        return name; 
    } 

    /** получаем цену продукта */
    public Double getPrice(){ 
        return price; 
    }
    /**
     * конструктор продукта 2 параметра
     * @param value получаем цену продукта
     */
    public void setPrice(Double value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
        }
        this.price = value;

    }
    /**
     * конструктор продукта 1 параметра
     * @param value получаем наименование продукта
     */
    public void setName(String value){
        this.name = value;
    }
    /**переопределение вывода продукта */
@Override
    public String toString(){
        return "Product{"+ "name='"+name+ '\''+",cost="+price+'}';
    }
    
   
}
