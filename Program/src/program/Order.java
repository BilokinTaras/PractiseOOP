/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
/**
 *
 * @author Taras
 */
public class Order {
    private final int Id;
    public String name;
    public String courier;
    public String dateTime;
    public String  type;
    
    public Order(int Id, String firstName, String lastName, String address){
        this.Id = Id;
        this.name = name;
        this.courier = courier;
       
    }
    
    /**
     *
     * @return
     */
    @Override
     public String toString(){
        return this.name +" "+ this.courier;
    }
}
