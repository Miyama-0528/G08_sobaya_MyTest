package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dto.TableDTO;
import viewmodel.TableListViewModel;

public class TableService {

    public TableListViewModel getTableList() {

        // 仮データ（後で DAO に置き換える）
        List<TableDTO> list = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            TableDTO dto = new TableDTO();
            dto.setTableNumber(i);
            dto.setHasCustomer(false);  // とりあえず全席空き
            list.add(dto);
        }

        // ViewModel に詰める
        TableListViewModel vm = new TableListViewModel();
        vm.setTableList(list);

        return vm;
    }
}
