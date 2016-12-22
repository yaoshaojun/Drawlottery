package com.hudongwx.drawlottery.mobile.entitys;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_commodity_history")
public class CommodityHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "commodity_id")
    private Integer commodityId;

    /**
     * 幸运号id
     */
    @Column(name = "luck_code_id")
    private Integer luckCodeId;

    /**
     * 商品得主id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 期数
     */
    @Column(name = "round_time")
    private Date roundTime;

    /**
     * 购买数量
     */
    @Column(name = "buy_number")
    private Integer buyNumber;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public Integer getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取幸运号id
     *
     * @return luck_code_id - 幸运号id
     */
    public Integer getLuckCodeId() {
        return luckCodeId;
    }

    /**
     * 设置幸运号id
     *
     * @param luckCodeId 幸运号id
     */
    public void setLuckCodeId(Integer luckCodeId) {
        this.luckCodeId = luckCodeId;
    }

    /**
     * 获取商品得主id
     *
     * @return user_id - 商品得主id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置商品得主id
     *
     * @param userId 商品得主id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取期数
     *
     * @return round_time - 期数
     */
    public Date getRoundTime() {
        return roundTime;
    }

    /**
     * 设置期数
     *
     * @param roundTime 期数
     */
    public void setRoundTime(Date roundTime) {
        this.roundTime = roundTime;
    }

    /**
     * 获取购买数量
     *
     * @return buy_number - 购买数量
     */
    public Integer getBuyNumber() {
        return buyNumber;
    }

    /**
     * 设置购买数量
     *
     * @param buyNumber 购买数量
     */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
}