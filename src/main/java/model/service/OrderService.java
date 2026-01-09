package model.service;

import java.util.List;

import database.OrderDAO;
import model.dto.TableInfoDTO;
import model.dto.getCashiersDTO;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    public List<getCashiersDTO> getOrdersByTable(int tableNumber) {
        return orderDAO.findByTableNumber(tableNumber);
    }

    public TableInfoDTO getTableInfo(int tableNumber, List<getCashiersDTO> orders) {

        int sum = 0;
        for (getCashiersDTO o : orders) {
            sum += o.getPrice() * o.getStock();
        }

        TableInfoDTO info = new TableInfoDTO();
        info.setTableNumber(tableNumber);
        info.setTotalPrice(sum);
        return info;
    }
}
