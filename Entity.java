/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagemntsystem;

/**
 *
 * @author G.B
 */
public class Entity {
    protected String name;
    
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void printInfo(){
        System.out.println("Name        : " + this.name);
    }
}
