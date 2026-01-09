package viewmodel;

import java.util.List;

import model.dto.getCashiersDTO;

public class CashiersViewModel {
    private int tableNumber;
    private int totalPrice;
    private List<getCashiersDTO> orderList;

    public int getTableNumber() {
    	return tableNumber;
    }
    
    public void setTableNumber(int tableNumber) {
    	this.tableNumber = tableNumber;
    }

    public int getTotalPrice() {
    	return totalPrice;
    }
    
    public void setTotalPrice(int totalPrice) {
    	this.totalPrice = totalPrice;
    }

    public List<getCashiersDTO> getOrderList() {
    	return orderList;
    }
    
    public void setOrderList(List<getCashiersDTO> orderList) {
    	this.orderList = orderList;
    }
}
