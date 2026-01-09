package database;

import java.util.ArrayList;
import java.util.List;

import model.dto.getCashiersDTO;

public class OrderDAO {

//	/**
//   * DBManager用
//   */
//	//卓番号で注文一覧を取得
//  public List<getCashiersDTO> findByTableNumber(int tableNumber) {
//
//      List<getCashiersDTO> list = new ArrayList<>();
//
//      String sql = """
//                   SELECT order_name,stock,price,order_status
//                   FROM orders
//                   WHERE table_number = ? 
//                   """;
//
//      try (
//          Connection con = DBManager.getConnection();
//          PreparedStatement ps = con.prepareStatement(sql)
//      ) {
//          ps.setInt(1, tableNumber);
//
//          ResultSet rs = ps.executeQuery();
//
//          while (rs.next()) {
//              getCashiersDTO dto = new getCashiersDTO();
//              dto.setOrderName(rs.getString("order_name"));
//              dto.setStock(rs.getInt("stock"));
//              dto.setPrice(rs.getInt("price"));
//              dto.setOrderStatus(rs.getString("order_status"));
//              list.add(dto);
//          }
//
//      } catch (Exception e) {
//          e.printStackTrace();
//      }
//
//      return list;
//  }
//
//  //卓の注文を会計済みに更新
//  public void updateStatusToPaid(int tableNumber) {
//
//      String sql = """
//      						 UPDATE orders
//      						 SET order_status = '会計済'
//      						 WHERE table_number = ?
//      						 """;
//
//      try (
//          Connection con = DBManager.getConnection();
//          PreparedStatement ps = con.prepareStatement(sql)
//      ) {
//          ps.setInt(1, tableNumber);
//          ps.executeUpdate();
//
//      } catch (Exception e) {
//          e.printStackTrace();
//      }
//  }
	
  /**
   * 仮データ（本番はDB接続）
   */
  public List<getCashiersDTO> findByTableNumber(int tableNumber) {

    List<getCashiersDTO> list = new ArrayList<>();

    // --- 仮データ1 ---
    getCashiersDTO o1 = new getCashiersDTO();
    o1.setOrderName("きつねうどん");
    o1.setStock(2);
    o1.setPrice(800);
    o1.setOrderStatus("提供済み");
    list.add(o1);

    // --- 仮データ2 ---
    getCashiersDTO o2 = new getCashiersDTO();
    o2.setOrderName("コーラ");
    o2.setStock(1);
    o2.setPrice(300);
    o2.setOrderStatus("提供前");
    list.add(o2);

    // --- 仮データ3 ---
    getCashiersDTO o3 = new getCashiersDTO();
    o3.setOrderName("生ビール");
    o3.setStock(1);
    o3.setPrice(500);
    o3.setOrderStatus("提供済み");
    list.add(o3);
      
      // --- 仮データ4 ---
    getCashiersDTO o4 = new getCashiersDTO();
    o4.setOrderName("漬物");
    o4.setStock(1);
    o4.setPrice(100);
    o4.setOrderStatus("提供中");
    list.add(o4);

    return list;
  }

    // ★ 会計済にするメソッド
    public void updateStatusToPaid(int tableNumber) {
        List<getCashiersDTO> list = findByTableNumber(tableNumber);

        if (list == null) {
        	return;
        }

        for (getCashiersDTO o : list) {
            o.setOrderStatus("会計済");
        }
    }
}
