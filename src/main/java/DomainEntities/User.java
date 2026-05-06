package DomainEntities;

import javaTesting.Resources.PasswordUtils;
public class User {
    public String name;
    public String password;
    private String salt;//von canviant a cada usuari
    //password ==hash!password real + salt
    public User() {
        this("Tomeu","secret");
    }
    public User(String name, String password){
        this.name=name;
        this.password=password;
    }
    public void setName(String name, String password){
        this.name=name;
        this.salt=PasswordUtils.
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
}
