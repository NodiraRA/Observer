/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author nodira
 */
public class JobSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscribers("Nodira Rakhimjonova");
        Observer secondSubscriber = new Subscribers("Ozodbek Kamolov");
        
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        
        jobSite.addVacancy("Third Java position");
        jobSite.removeVacancy("Firts Java position");
    }
    
}
