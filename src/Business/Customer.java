/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author jhsnehashree
 */
public class Customer {
    
    private String customerName;
    
    private String reservedSeatNo;
    
    private String reservedSeatClass;
    
    private int customerPhoneNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getReservedSeatNo() {
        return reservedSeatNo;
    }

    public void setReservedSeatNo(String reservedSeatNo) {
        this.reservedSeatNo = reservedSeatNo;
    }

    public String getReservedSeatClass() {
        return reservedSeatClass;
    }

    public void setReservedSeatClass(String reservedSeatClass) {
        this.reservedSeatClass = reservedSeatClass;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    

}
