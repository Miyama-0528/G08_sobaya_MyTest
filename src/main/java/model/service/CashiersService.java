package model.service;

import java.util.List;

import database.OrderDAO;
import model.dto.TableInfoDTO;
import model.dto.getCashiersDTO;
import viewmodel.CashiersViewModel;

public class CashiersService {

    public CashiersViewModel createViewModel(int tableNumber) {

        // 卓情報（例：席番号だけなら DTO を直接生成）
        TableInfoDTO tableInfo = new TableInfoDTO();
        tableInfo.setTableNumber(tableNumber);

        // 注文一覧を取得
        OrderDAO dao = new OrderDAO();
        List<getCashiersDTO> orderList = dao.findByTableNumber(tableNumber);

        // 合計金額を計算
        int total = 0;
        for (getCashiersDTO order : orderList) {
            total += order.getPrice() * order.getStock(); // 金額 × 個数
        }

        // ViewModel にセット
        CashiersViewModel vm = new CashiersViewModel();
        vm.setTableNumber(tableNumber);
        vm.setOrderList(orderList);

        return vm;
    }
}
