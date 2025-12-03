package model.service;

import java.util.List;

import database.OrderDAO;
import model.dto.OrderDTO;
import model.dto.TableInfoDTO;
import viewmodel.TableBillViewModel;

public class OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    // 注文一覧取得
    public List<OrderDTO> getOrdersByTable(int tableNo) {
        return orderDAO.findByTableNo(tableNo);
    }

    // 合計金額や卓情報を作成して ViewModel にまとめる
    public TableBillViewModel createViewModel(int tableNo) {

        // 注文一覧を取得
        List<OrderDTO> orders = getOrdersByTable(tableNo);

        // 合計金額計算
        int total = 0;
        for (OrderDTO o : orders) {
            total += o.getPrice() * o.getStock();
        }

        // 卓情報 DTO を作成
        TableInfoDTO tableInfo = new TableInfoDTO();
        tableInfo.setTableNumber(tableNo);
        tableInfo.setTotalPrice(total);

        // ViewModel にまとめる
        TableBillViewModel vm = new TableBillViewModel();
        vm.setTableInfo(tableInfo);
        vm.setOrderList(orders);
        vm.setTotalPrice(total);

        return vm;
    }
}
