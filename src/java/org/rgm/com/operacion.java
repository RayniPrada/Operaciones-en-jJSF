/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rgm.com;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hp
 */
@ManagedBean
@RequestScoped
public class operacion {


    int n1;
    int n2;
    int s;
    int m;
    int r;
    int d;
    /**
     * Creates a new instance of operacion
     */
    public operacion() {
    }
public void sumar(){
s= n1 + n2; 
r= n1 - n2;
m=n1 * n2;
d=n1/n2;

if(n1 <= n2){
FacesContext c = FacesContext.getCurrentInstance();
    c.addMessage(null,new FacesMessage("LAS OPERACIONES SON :","SUMA : "+s+
                                                                "-----RESTA : "+r+
                                                                "-----MULTIPLICAION :" +m+
                                                                "-----DIVISION :" +d));
                        
            }else{
FacesContext c = FacesContext.getCurrentInstance();
    c.addMessage(null,new FacesMessage("LAS OPERACIONES SON : ","SUMA : "+s+ 
                                                                "------RESTA : "+r+ 
                                                                "------MULTIPLICACION :"+m+
                                                                "--------NO SE PUEDE DIVIDIR"));

}
    
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }


    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }



}
   
