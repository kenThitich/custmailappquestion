package customermailapplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUFGAMING
 */
public class CustomerFactory {
    public static Customer getCustomerTypeFromUser(int customerType) {
        Customer customer=null;
        switch(customerType) {
            case 1:
                return new RegularCustomer();
             
            //complete MountainCustomer
            case 2:
                return new MountainCustomer();
              
            //complete DelinquentCustomer 
            case 3:
                return new DelinquentCustomer();
        }
        return customer;
    }
    
     public static String generateMail(Customer app) {
        return app.createMail();
    }
    
}
