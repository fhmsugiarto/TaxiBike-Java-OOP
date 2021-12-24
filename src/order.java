package src;
//abstract class
public abstract class order{
    private String customer, location, destination;
    private int distance, cost;
    //abstract method
    public abstract void payment();

    //Setter Encapsulation
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

    //Getter Encapsulation
    public String getCustomer(){
        return this.customer;
    }
    public String getLocation(){
        return this.location;
    }
    public String getDestination(){
        return this.destination;
    }
    public int getDistance(){
        return this.distance;
    }
    public int getCost(){
        return this.cost;
    }
}
