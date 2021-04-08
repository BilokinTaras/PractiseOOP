/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taras
 */
public class Order {
    public String Id;
    public String name;
    public String courier;
    public String dateTime;
    public String type;

    public Order(String Id, String name, String courier, String dateTime, String type) {
        this.Id = Id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.type = type;

    }

    public String GetIdOrder() {
        return Id;
    }

    public String GetOrderName() {
        return name;
    }

    public String GetOrdercourier() {
        return courier;
    }

    public String dateTime() {
        return name;
    }

    public String GetOrderType() {
        return type;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.Id + " " + this.name + " " + this.courier + " " + this.dateTime + " " + this.type;
    }
}
