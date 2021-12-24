package src;
public class send extends order{
	private int weight;
	public send(String customer, String location, String destination, int distance, int weight){
		this.setCustomer(customer);
		this.setLocation(location);
		this.setDestination(destination);
		this.setDistance(distance);
		this.setWeight(weight);
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return this.weight;
	}
	//override
	public void payment(){
		this.setCost((this.getDistance()*2000)+(this.getWeight()*2000));
		System.out.println("Customer = "+this.getCustomer());
		System.out.println("Route = "+this.getLocation()+"-"+this.getDestination()+"("+this.getDistance()+"Km)");
		System.out.println("Weight = "+this.getWeight());
		System.out.println("Cost = "+this.getCost());
	}
}
