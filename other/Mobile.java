public class Mobile {  
    String name;  
    String ram;  
    String rom;  
    
    public Mobile(String name, String ram, String rom) {  
       this.name = name;  
       this.ram = ram;  
       this.rom = rom;  
    }  
    
    public String getName() {
       return this.name;
    }
    
    public String getRam() {
       return this.ram;
    }
    
    public String getRom() {
       return this.rom;
    }

    public void setMobileNo(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMobileNo'");
    }

    public String getMobileNo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMobileNo'");
    }
 }
 