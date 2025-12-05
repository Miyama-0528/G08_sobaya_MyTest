package model.service;

import java.util.List;

import database.OrderDAO;
import model.dto.OrderDTO;
import model.dto.TableInfoDTO;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    public List<OrderDTO> getOrdersByTable(int tableNo) {
        return orderDAO.findByTableNumber(tableNo);
    }

    public TableInfoDTO getTableInfo(int tableNo, List<OrderDTO> orders) {

        int sum = 0;
        for (OrderDTO o : orders) {
            sum += o.getPrice() * o.getStock();
        }

        TableInfoDTO info = new TableInfoDTO();
        info.setTableNumber(tableNo);
        info.setTotalPrice(sum);
        return info;
    }
}
