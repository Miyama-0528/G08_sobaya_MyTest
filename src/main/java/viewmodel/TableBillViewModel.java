package viewmodel;

import java.util.List;

import model.dto.OrderDTO;
import model.dto.TableInfoDTO;

public class TableBillViewModel {
	private TableInfoDTO 卓情報;
  private List<OrderDTO> 注文一覧;

  public TableInfoDTO get卓情報() { return 卓情報; }
  public void set卓情報(TableInfoDTO 卓情報) { this.卓情報 = 卓情報; }

  public List<OrderDTO> get注文一覧() { return 注文一覧; }
  public void set注文一覧(List<OrderDTO> 注文一覧) { this.注文一覧 = 注文一覧; }
}
