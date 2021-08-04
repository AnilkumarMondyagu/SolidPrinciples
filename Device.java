public class Device{
    public static void main(String args[]){

        Laptop personelLappy=new Laptop(4,"i5");
        System.out.println("Laptop Ram:"+personelLappy.getRam()+" Processor:"+personelLappy.getProcessor()+"\n");

        OfficeLaptop officeLappy=new OfficeLaptop(6,"i5");
        System.out.println("OfficeLaptop Ram:"+officeLappy.getRam()+" Processor:"+officeLappy.getProcessor());
        officeLappy.restrictExternalCommunication();

        GamingLaptop gamingLappy=new GamingLaptop(8,"i7",4);
        System.out.println("GamingLaptop Ram:"+gamingLappy.getRam()+" Processor:"+gamingLappy.getProcessor());
        gamingLappy.addedGraphics();

        SpecialGamingLaptop specialGamingLappy=new SpecialGamingLaptop(12,"i7",8,new JoyStick());
        System.out.println("SpecialLaptop Ram:"+specialGamingLappy.getRam()+" Processor:"+specialGamingLappy.getProcessor());
        specialGamingLappy.addNewComponent(new WebCam());
        specialGamingLappy.addedGraphics();
    }
}