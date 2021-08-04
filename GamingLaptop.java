//GamingLaptop with graphic card to support gaming
public class GamingLaptop extends Laptop implements Graphics{
	private int graphicMemory;
	public GamingLaptop(int ram,String processor,int graphicMemory){
	    super(ram,processor);
		this.graphicMemory=graphicMemory;
	}
	public void addedGraphics(){
	    System.out.println("Graphic card:"+graphicMemory+"\n");
	}

}