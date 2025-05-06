public class Person{
    private String firstname, lastname, ssn;
    private int birthDay, birthMonth,birthYear, numberOfSibling;
    private Person[] siblings;
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthDay=birthDay;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
        this.ssn=ssn;
        this.siblings= new Person[0];
    }
    public String getFirtname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setFirtname(String firstname){
        this.firstname=firstname;
    }
    public void setLastname(String Lastname){
        this.lastname=Lastname;
    } 
    public String getBirthDay(){
        return this.birthDay+"/"+this.birthMonth+"/"+ this.birthYear;
    }
    public   
     
}