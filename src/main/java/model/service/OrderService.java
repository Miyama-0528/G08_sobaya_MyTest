package model.service;

import java.util.List;

import database.OrderDAO;
import model.dto.OrderDTO;
import model.dto.TableInfoDTO;

public class OrderService {
	private OrderDAO orderDAO = new OrderDAO();

  public List<OrderDTO> getOrdersByTable(int tableNo) {
      return orderDAO.findByTableNo(tableNo);
  }

  public TableInfoDTO getTableInfo(int tableNo, List<OrderDTO> orders) {
      int sum = 0;
      for (OrderDTO o : orders) {
          sum += o.get金額() * o.get個数();
      }

      TableInfoDTO tableInfo = new TableInfoDTO();
      tableInfo.set卓番号(tableNo);
      tableInfo.set合計金額(sum);

      return tableInfo;
  }
}
