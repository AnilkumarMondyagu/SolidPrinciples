//OfficeLaptop with Security added to it
public class OfficeLaptop extends Laptop implements Security{
    public OfficeLaptop(int ram,String processor){
        super(ram,processor);
        //System.out.println("OfficeLaptop Ram:"+getRam()+" Processor:"+getProcessor());
        //microServices();
    }
	public void restrictExternalCommunication(){
		System.out.println("Restrictions to unautorized access from outside organtization in OfficeLaptop\n");
	}

}