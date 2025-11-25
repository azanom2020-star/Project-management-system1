/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanagemntsystem;

import java.util.ArrayList;

/**
 *
 * @author G.B
 */
public class User extends Entity{
    private ArrayList<Project> projects;
    
    public User(String name){
    this.name = name;
    this.projects = new ArrayList<Project>();
    }
    
    public void insertProject(Project project){
        this.projects.add(project);
    }
    public void deleteProject(Project project){
        for(int i = 0; i < this.projects.size(); i++){
            if(this.projects.get(i).getName() == project.getName()){
                this.projects.remove(i);
                break;
            }
        }
    }
}
