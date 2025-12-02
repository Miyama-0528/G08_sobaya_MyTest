package database;

import java.util.ArrayList;
import java.util.List;

import model.dto.OrderDTO;

public class OrderDAO {
	
	public List<OrderDTO> findByTableNo(int tableNo) {

    // 仮データ（DB ない場合でも開発が進む）
    List<OrderDTO> list = new ArrayList<>();

    OrderDTO a = new OrderDTO();
    a.set商品名("唐揚げ");
    a.set金額(500);
    a.set個数(2);
    a.set注文状態("提供済");

    OrderDTO b = new OrderDTO();
    b.set商品名("コーラ");
    b.set金額(300);
    b.set個数(1);
    b.set注文状態("調理中");

    list.add(a);
    list.add(b);

    return list;
}
}
