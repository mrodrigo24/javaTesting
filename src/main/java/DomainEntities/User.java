package DomainEntities;

import JavaTesting.Resources.PasswordUtils;

public class User {
    private String name;
    private String password;
    private String salt;//von canviant a cada usuari
    //password ==hash!password real + salt
    public User() {
        this("Tomeu","secret");
    }
    public User(String name, String password){
        this.name=name;
        this.salt=PasswordUtils.genSalt();
        this.password=PasswordUtils.hashedPassword(password,this.salt);
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public boolean verifyPassword(String passwordEntered){
        return PasswordUtils.verifiUserPassword(passwordEntered,salt,password );
    }

    public void setPassword(String password){
        this.password=PasswordUtils.hashedPassword(password,salt);
    }

}
