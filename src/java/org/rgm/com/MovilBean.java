
package org.rgm.com;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class MovilBean implements Serializable{
   private String username = "";
   private String password = ""; 
  private String nombre="";
  
   public String getNombre() {
        return nombre;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
  
  public String getUsername() {
        return username;
    }
   
   
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String login(){
            if(this.username !=null & this.username.equals("admin") && this.password.equals("admin")){
                return "pm:exitos";
    }else{
            return "pm:fallida";
            }
    }
}
