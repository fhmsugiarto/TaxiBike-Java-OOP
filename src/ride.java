package src;
public class ride extends order {
    public ride(String customer, String location, String destination, int distance){
        this.setCustomer(customer);
        this.setLocation(location);
        this.setDestination(destination);
        this.setDistance(distance);
    }

    public void payment(){
        this.setCost(this.getDistance()*5000);
        System.out.println("Customer = "+this.getCustomer());
        System.out.println("Route = "+this.getLocation()+"-"+this.getDestination()+"("+this.getDistance()+"Km)");
        System.out.println("Cost = "+this.getCost());
    }
}
