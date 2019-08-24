package cn.sisyphe.logistics.yh.domain.tj.entity;

import java.math.BigDecimal;

public class PreTjItem extends PreTjItemKey {
    private Integer hAmount;

    private Integer hAmountVerify;

    private BigDecimal hPrice;

    private String memo;

    private Integer sortNumber;

    private Integer hAmountJh;

    private String isChecked;

    private Integer checkedSort;

    public Integer gethAmount() {
        return hAmount;
    }

    public void sethAmount(Integer hAmount) {
        this.hAmount = hAmount;
    }

    public Integer gethAmountVerify() {
        return hAmountVerify;
    }

    public void sethAmountVerify(Integer hAmountVerify) {
        this.hAmountVerify = hAmountVerify;
    }

    public BigDecimal gethPrice() {
        return hPrice;
    }

    public void sethPrice(BigDecimal hPrice) {
        this.hPrice = hPrice;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer gethAmountJh() {
        return hAmountJh;
    }

    public void sethAmountJh(Integer hAmountJh) {
        this.hAmountJh = hAmountJh;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public Integer getCheckedSort() {
        return checkedSort;
    }

    public void setCheckedSort(Integer checkedSort) {
        this.checkedSort = checkedSort;
    }
}