package viewmodel;

import java.util.List;

import model.dto.TableDTO;

public class TableListViewModel {
    private List<TableDTO> tableList;

    public List<TableDTO> getTableList() {
        return tableList;
    }

    public void setTableList(List<TableDTO> tableList) {
        this.tableList = tableList;
    }
}
