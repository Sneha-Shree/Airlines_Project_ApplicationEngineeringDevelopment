/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jhsnehashree
 */
public class Airplane {
    
   private ArrayList<Customer>customerlst;
  
    public Airplane()
    {
        this.createdOn=new Date();
        this.customerlst=new ArrayList<Customer>();
        
    }

    public ArrayList<Customer> getCustomerlst() {
        return customerlst;
    }

    public void setCustomerlst(ArrayList<Customer> customerlst) {
        this.customerlst = customerlst;
    }

   
   

    
   private String airlineCompany;
   private String airlinerName;
   
   private String sourcePlace;
   private String destinationPlace;
   
   private Date startDate;
   private Date endDate;
   
   private int totalSeatsAvailable;
   private int totalSeatsBooked;
   private int ratings;
   
   private int windowTotal;
   private int aisleTotal;
   private int middleTotal;
   
   private int windowBooked;
   private int aisleBooked;
   private int middleBooked;
   
   private double windowPrice;
   private double aislePrice;
   private double middlePrice;
   private Date createdOn; 
   
   private String customerName;
   private String customerSeatNo;
   private String customerPhoneNo;
 
    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getSourcePlace() {
        return sourcePlace;
    }

    public void setSourcePlace(String sourcePlace) {
        this.sourcePlace = sourcePlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalSeatsAvailable() {
        return totalSeatsAvailable;
    }

    public void setTotalSeatsAvailable(int totalSeatsAvailable) {
        this.totalSeatsAvailable = totalSeatsAvailable;
    }

    public int getTotalSeatsBooked() {
        return totalSeatsBooked;
    }

    public void setTotalSeatsBooked(int totalSeatsBooked) {
        this.totalSeatsBooked = totalSeatsBooked;
    }

    public int getWindowBooked() {
        return windowBooked;
    }

    public void setWindowBooked(int windowBooked) {
        this.windowBooked = windowBooked;
    }

    public int getAisleBooked() {
        return aisleBooked;
    }

    public void setAisleBooked(int aisleBooked) {
        this.aisleBooked = aisleBooked;
    }

    public int getMiddleBooked() {
        return middleBooked;
    }

    public void setMiddleBooked(int middleBooked) {
        this.middleBooked = middleBooked;
    }

    public double getWindowPrice() {
        return windowPrice;
    }

    public void setWindowPrice(double windowPrice) {
        this.windowPrice = windowPrice;
    }

    public double getAislePrice() {
        return aislePrice;
    }

    public void setAislePrice(double aislePrice) {
        this.aislePrice = aislePrice;
    }

    public double getMiddlePrice() {
        return middlePrice;
    }

    public void setMiddlePrice(double middlePrice) {
        this.middlePrice = middlePrice;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getWindowTotal() {
        return windowTotal;
    }

    public void setWindowTotal(int windowTotal) {
        this.windowTotal = windowTotal;
    }

    public int getAisleTotal() {
        return aisleTotal;
    }

    public void setAisleTotal(int aisleTotal) {
        this.aisleTotal = aisleTotal;
    }

    public int getMiddleTotal() {
        return middleTotal;
    }

    public void setMiddleTotal(int middleTotal) {
        this.middleTotal = middleTotal;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSeatNo() {
        return customerSeatNo;
    }

    public void setCustomerSeatNo(String customerSeatNo) {
        this.customerSeatNo = customerSeatNo;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }


    
   
    //Override
    public String toString()
    {
        return airlineCompany;
                
    }
  
   
   

}
