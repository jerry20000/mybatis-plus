package cn.sisyphe.logistics.yh.domain.yh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PreYhItem extends PreYhItemKey {
    private Integer hAmount;

    private BigDecimal hPrice;

    private String memo;

    private Integer sortNumber;

    private Integer hAmountJh;

    private String isChecked;

    private Date checkedDate;

    private String allowTonb;

    private String reasonId;

    private String hIdOld;

    public Integer gethAmount() {
        return hAmount;
    }

    public void sethAmount(Integer hAmount) {
        this.hAmount = hAmount;
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

    public Date getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(Date checkedDate) {
        this.checkedDate = checkedDate;
    }

    public String getAllowTonb() {
        return allowTonb;
    }

    public void setAllowTonb(String allowTonb) {
        this.allowTonb = allowTonb;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String gethIdOld() {
        return hIdOld;
    }

    public void sethIdOld(String hIdOld) {
        this.hIdOld = hIdOld;
    }
}