/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TripMenu;

import java.util.Date;

/**
 *
 * @author james
 */
public class Trip {

    private String route;
    private int busNo;
    private int referenceNo;
    private Date date;
    private Date time;
    private double price;

    public Trip(String route, int busNo, int referenceNo, Date date, Date time, double price) {
        this.route = route;
        this.busNo = busNo;
        this.referenceNo = referenceNo;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public String getRoute() {
        return route;
    }

    public int getBusNo() {
        return busNo;
    }

    public int getReferenceNo() {
        return referenceNo;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

}
