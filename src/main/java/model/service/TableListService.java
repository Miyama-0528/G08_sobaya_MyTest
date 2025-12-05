package model.service;

import java.util.ArrayList;
import java.util.List;

import model.dto.TableDTO;
import viewmodel.TableListViewModel;

public class TableListService {

    public TableListViewModel getTableList() {

        // ================================
        // ★ 元の仮データ（全席空き）
        // ================================
    		
        /*
        List<TableDTO> list = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            TableDTO dto = new TableDTO();
            dto.setTableNumber(i);
            dto.setHasCustomer(false);  // とりあえず全席空き
            list.add(dto);
        }
        */

        // ================================
        // ★ 修正版：一部の席にお客さんがいる状態
        // ================================
    		
        List<TableDTO> list = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            TableDTO dto = new TableDTO();
            dto.setTableNumber(i);

            // 1番卓にお客さんがいる例
            if (i == 1) {
                dto.setHasCustomer(true);   // 使用中
            } else {
                dto.setHasCustomer(false);  // 空席
            }

            list.add(dto);
        }

        // ViewModel にセット
        TableListViewModel vm = new TableListViewModel();
        vm.setTableList(list);

        return vm;
    }
}
