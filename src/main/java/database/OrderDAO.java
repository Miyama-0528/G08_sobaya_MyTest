package database;

import java.util.ArrayList;
import java.util.List;

import model.dto.OrderDTO;

public class OrderDAO {
	
	public List<OrderDTO> findByTableNo(int tableNo) {

    // 仮データ（DB ない場合でも開発が進む）
    List<OrderDTO> list = new ArrayList<>();

    OrderDTO a = new OrderDTO();
    a.setOrderName("唐揚げ");
    a.setPrice(500);
    a.setStock(2);
    a.setOrderStatus("提供済");

    OrderDTO b = new OrderDTO();
    b.setOrderName("コーラ");
    b.setPrice(300);
    b.setStock(1);
    b.setOrderStatus("調理中");

    list.add(a);
    list.add(b);

    return list;
}
}
