/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.List;

/**
 *
 * @author nodira
 */
public class Subscribers implements Observer{

    String name;

    public Subscribers(String name) {
        this.name = name;
    }
    
    
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies + "\n========================================================\n");
    }
    
}
