package viewmodel;

import java.util.List;

import model.dto.OrderDTO;
import model.dto.TableInfoDTO;

public class TableBillViewModel {
	private TableInfoDTO tableInfo;
  private List<OrderDTO> orderList;
  private int totalPrice;

  public TableInfoDTO getTableInfo() {
  	return tableInfo;
  }
  
  public void setTableInfo(TableInfoDTO tableInfo) {
  	this.tableInfo = tableInfo;
  }

  public List<OrderDTO> getOrderList() {
  	return orderList;
  }
  
  public void setOrderList(List<OrderDTO> orderList) {
  	this.orderList = orderList;
  }
  
  public int getTotalPrice() {
    return totalPrice;
}

  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
}
}
