package com.cc.entity;

import java.math.BigDecimal;

public class Product {
    private int epId;
    private String epName;
    private BigDecimal epPrice;
    private String epDescription;
    private int  epStock;
    private int epcId;
    private int epcChildId;
    private String epFileName;
    private int count = 1;//商品的购买数量
    
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getEpId() {
        return epId;
    }

    public void setEpId(int epId) {
        this.epId = epId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public BigDecimal getEpPrice() {
        return epPrice;
    }

    public void setEpPrice(BigDecimal epPrice) {
        this.epPrice = epPrice;
    }

    public String getEpDescription() {
        return epDescription;
    }

    public void setEpDescription(String epDescription) {
        this.epDescription = epDescription;
    }

    public int getEpStock() {
        return epStock;
    }

    public void setEpStock(int epStock) {
        this.epStock = epStock;
    }

    public int getEpcId() {
        return epcId;
    }

    public void setEpcId(int epcId) {
        this.epcId = epcId;
    }

    public int getEpcChildId() {
        return epcChildId;
    }

    public void setEpcChildId(int epcChildId) {
        this.epcChildId = epcChildId;
    }

    public String getEpFileName() {
        return epFileName;
    }

    public void setEpFileName(String epFileName) {
        this.epFileName = epFileName;
    }

    public Product(int epId, String epName, BigDecimal epPrice, String epDescription, int epStock, int epcId,
            int epcChildId, String epFileName) {
        super();
        this.epId = epId;
        this.epName = epName;
        this.epPrice = epPrice;
        this.epDescription = epDescription;
        this.epStock = epStock;
        this.epcId = epcId;
        this.epcChildId = epcChildId;
        this.epFileName = epFileName;
    }
    
    

    @Override
    public String toString() {
        return "Product [epId=" + epId + ", epName=" + epName + ", epPrice=" + epPrice + ", epDescription="
                + epDescription + ", epStock=" + epStock + ", epcId=" + epcId + ", epcChildId=" + epcChildId
                + ", epFileName=" + epFileName + "]\n";
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (epDescription == null) {
            if (other.epDescription != null)
                return false;
        } else if (!epDescription.equals(other.epDescription))
            return false;
        if (epFileName == null) {
            if (other.epFileName != null)
                return false;
        } else if (!epFileName.equals(other.epFileName))
            return false;
        if (epId != other.epId)
            return false;
        if (epName == null) {
            if (other.epName != null)
                return false;
        } else if (!epName.equals(other.epName))
            return false;
        if (epPrice == null) {
            if (other.epPrice != null)
                return false;
        } else if (!epPrice.equals(other.epPrice))
            return false;
        if (epStock != other.epStock)
            return false;
        if (epcChildId != other.epcChildId)
            return false;
        if (epcId != other.epcId)
            return false;
        return true;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
  
    
}
