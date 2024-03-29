package player;

public class Player {
     String name;
    //private  char symbol;
     String address;
     String contactNum;
     String emailId;
     int age;
    
    public void setPlayersDetails(String name, String address, String contactNum, String emailId, int age){
        this.name = name;
        //this.symbol= symbol;
        this.address = address;
        this.contactNum= contactNum;
        this.emailId=emailId;
        this.age= age;
    }

  /*  public void setPlayersDetails(String name,String address, String contactNum, String emailId, int age){
       this.name =name;
       this.address = address;
       this.contactNum= contactNum;
       this.emailId=emailId;
       this.age= age;
    }*/
    public void setPlayersNameAndAge(String name, int age){
        this.name= name;
        this.age =age;
    }
    public String getPlayersName(){
       return this.name;
    }
    
}
