package br.com.exemplo;

import java.util.Date;

public class MutualFundDataDTO 
{
    private String schemeCode;
     
    private String isinGrowth;
     
    private String isinDividendReinvest;
     
    private String schemeName;
     
    private double nav;
     
    private double repurchasePrice;
     
    private double salePrice;
     
    private Date date;
 
    public String getSchemeCode() {
        return schemeCode;
    }
 
    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }
 
    public String getIsinGrowth() {
        return isinGrowth;
    }
 
    public void setIsinGrowth(String isinGrowth) {
        this.isinGrowth = isinGrowth;
    }
 
    public String getIsinDividendReinvest() {
        return isinDividendReinvest;
    }
 
    public void setIsinDividendReinvest(String isinDividendReinvest) {
        this.isinDividendReinvest = isinDividendReinvest;
    }
 
    public String getSchemeName() {
        return schemeName;
    }
 
    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }
 
    public double getNav() {
        return nav;
    }
 
    public void setNav(double nav) {
        this.nav = nav;
    }
 
    public double getRepurchasePrice() {
        return repurchasePrice;
    }
 
    public void setRepurchasePrice(double repurchasePrice) {
        this.repurchasePrice = repurchasePrice;
    }
 
    public double getSalePrice() {
        return salePrice;
    }
 
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
 
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
}