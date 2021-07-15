//SpecialGamingLaptop with added features to it
public class SpecialGamingLaptop extends GamingLaptop{
	SpecialFeatures component;
	public SpecialGamingLaptop(int ram,String processor, int graphicMemory,SpecialFeatures newFeature){
	    super(ram,processor,graphicMemory);
		component=newFeature;
		component.addComponent();
	}
	public void addNewComponent(SpecialFeatures newFeature){
	    component=newFeature;
	    component.addComponent();
	}
}