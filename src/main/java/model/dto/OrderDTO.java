package model.dto;

public class OrderDTO {
	 private int orderId;
   private String 商品名;
   private int 金額;
   private int 個数;
   private String 注文状態;

   public int getOrderId() { return orderId; }
   public void setOrderId(int orderId) { this.orderId = orderId; }

   public String get商品名() { return 商品名; }
   public void set商品名(String 商品名) { this.商品名 = 商品名; }

   public int get金額() { return 金額; }
   public void set金額(int 金額) { this.金額 = 金額; }

   public int get個数() { return 個数; }
   public void set個数(int 個数) { this.個数 = 個数; }

   public String get注文状態() { return 注文状態; }
   public void set注文状態(String 注文状態) { this.注文状態 = 注文状態; }
}
