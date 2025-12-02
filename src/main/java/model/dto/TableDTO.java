package model.dto;

public class TableDTO {
    private int tableNumber;
    private boolean hasCustomer;

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public boolean isHasCustomer() {
        return hasCustomer;
    }

    public void setHasCustomer(boolean hasCustomer) {
        this.hasCustomer = hasCustomer;
    }
}
