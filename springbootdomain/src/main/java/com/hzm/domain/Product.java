package com.hzm.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Product implements Serializable {
    // CREATE TABLE `product` (
    // `pid` varchar(50) NOT NULL,
    // `pname` varchar(50) DEFAULT NULL,
    // `market_price` double DEFAULT NULL,
    // `shop_price` double DEFAULT NULL,
    // `pimage` varchar(200) DEFAULT NULL,
    // `pdate` date DEFAULT NULL,
    // `is_hot` int(11) DEFAULT NULL,
    // `pdesc` varchar(255) DEFAULT NULL,
    // `pflag` int(11) DEFAULT NULL,
    // `cid` varchar(32) DEFAULT NULL,
    // PRIMARY KEY (`pid`),
    // KEY `sfk_0001` (`cid`),
    // CONSTRAINT `sfk_0001` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`)
    // ) ENGINE=InnoDB DEFAULT CHARSET=utf8

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String pid;
    private String pname;
    private Double market_price;
    private Double shop_price;
    private String pimage;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date pdate;
    private Integer is_hot;
    private String pdesc;
    private Integer pflag;
    private String cid;

//    public String getPname() {
//        return pname;
//    }
//
//    public void setPname(String pname) {
//        this.pname = pname;
//    }
//
//    public Double getMarket_price() {
//        return market_price;
//    }
//
//    public void setMarket_price(Double market_price) {
//        this.market_price = market_price;
//    }
//
//    public Double getShop_price() {
//        return shop_price;
//    }
//
//    public void setShop_price(Double shop_price) {
//        this.shop_price = shop_price;
//    }
//
//    public String getPimage() {
//        return pimage;
//    }
//
//    public void setPimage(String pimage) {
//        this.pimage = pimage;
//    }
//
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    public Date getPdate() {
//        return pdate;
//    }
//
//    public void setPdate(Date pdate) {
//        this.pdate = pdate;
//    }
//
//    public Integer getIs_hot() {
//        return is_hot;
//    }
//
//    public void setIs_hot(Integer is_hot) {
//        this.is_hot = is_hot;
//    }
//
//    public Integer getPflag() {
//        return pflag;
//    }
//
//    public void setPflag(Integer pflag) {
//        this.pflag = pflag;
//    }
//
//    public String getCid() {
//        return cid;
//    }
//
//    public void setCid(String cid) {
//        this.cid = cid;
//    }
//
//    public String getPdesc() {
//        return pdesc;
//    }
//
//    public void setPdesc(String pdesc) {
//        this.pdesc = pdesc;
//    }
//
//    public String getPid() {
//        return pid;
//    }
//
//    public void setPid(String pid) {
//        this.pid = pid;
//    }

}
