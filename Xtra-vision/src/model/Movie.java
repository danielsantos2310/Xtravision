package model;

public class Movie {
     
   int id;
   public String name;
   public float price;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 
    
    public String getName() { 
        return name;
    } 
    public void setName(String name) { 
        this.name = name;
    } 
    
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    } 

    @Override
    public String toString() {
        return "\n" + "Movie"
                + "\n" + "id: " + id
                + "\n" + "name: " + name
                + "\n" + "price: " + price;
    }      
}

    

