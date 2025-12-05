package model.service;

import database.OrderDAO;
import database.TableDAO;

public class PaymentService {

    private OrderDAO orderDAO = new OrderDAO();
    private TableDAO tableDAO = new TableDAO();

    public void payBill(int tableNo, int payAmount, int totalAmount) {

        // ① 注文をすべて「会計済」に更新
        orderDAO.updateStatusToPaid(tableNo);

        // ② テーブルを「空席状態」に戻す
        tableDAO.updateToEmpty(tableNo);

        // 必要ならログ等を追加
        System.out.println(tableNo + "卓の会計が完了しました。");
    }
}
