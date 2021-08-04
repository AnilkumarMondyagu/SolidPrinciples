//Laptop with basic features and corresponding functionalties
public class Laptop{
	private int ram;
	private String processor;
	public Laptop(int ram,String processor){
	    this.ram=ram;
	    this.processor=processor;
	}
	public void setRam(int ram){
		this.ram=ram;
	}
	public void setProcessor(String processor){
		this.processor=processor;
	}
	public int getRam(){
		return ram;
	}
	public String getProcessor(){
		return processor;
	}

}