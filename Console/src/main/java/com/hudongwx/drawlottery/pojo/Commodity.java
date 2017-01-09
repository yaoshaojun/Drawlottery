package com.hudongwx.drawlottery.pojo;

import com.hudongwx.drawlottery.common.utils.DateUtils;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_commoditys")
public class Commodity {
    public static final int ON_SALE = 3;
    public static final int WILL_SALE = 4;
    public static final int DID_SALE = 5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 商品名
     */
    private String name;

    /**
     * 商品描述
     */
    @Column(name = "commodity_desc")
    private String commodityDesc;

    /**
     * 商品类型id
     */
    @Column(name = "commodity_type_id")
    private Long commodityTypeId;

    /**
     * 类型名
     */
    @Transient
    private String typeName;

    /**
     * 商品类别（1：实体，0：虚拟,2：实体不能快递）
     */
    private Integer genre;

    /**
     * 上一次购买人次
     */
    @Column(name = "buy_last_number")
    private Integer buyLastNumber;

    /**
     * 当前购买人次
     */
    @Column(name = "buy_current_number")
    private Integer buyCurrentNumber;
    @Column(name = "contact_name")
    private String contactName;
    @Column(name = "contact_phone")
    private String contactPhone;
    @Column(name = "contact_address")
    private String contactAddress;
    @Column(name = "card_type")
    private Integer cardType;
    @Column(name = "card_num")
    private Integer cardNum;
    @Column(name = "card_money")
    private Integer cardMoney;
    private String groundTimeLabel;
    private String undercarriageTimeLabel;
    /**
     * 上架时间
     */
    @Column(name = "ground_time")
    private Date groundTime;

    /**
     * 下架时间
     */
    @Column(name = "undercarriage_time")
    private Date undercarriageTime;

    /**
     * 剩余购买人次
     */
    private Integer buyNowNumber;
    /**
     * 总购买人次
     */
    @Column(name = "buy_total_number")
    private Integer buyTotalNumber;

    /**
     * 开抢时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 中奖幸运码id
     */
    @Column(name = "luck_code_id")
    private Long luckCodeId;

    /**
     * 商品状态id
     */
    @Column(name = "state_id")
    private Integer stateId;


    /**
     * 状态名
     */
    @Transient
    private String stateName;

    /**
     * 当前期数
     */
    @Column(name = "round_time")
    private String roundTime;

    /**
     * 封面图片id
     */
    @Column(name = "cover_img_url")
    private String coverImgUrl;

    /**
     * 是否自动生成下一期（1：是，0：否）
     */
    @Column(name = "auto_round")
    private Integer autoRound;

    /**
     * 商品详情URL
     */
    @Column(name = "commodity_desc_url")
    private String commodityDescUrl;

    /**
     * 售罄时间
     */
    @Column(name = "sell_out_time")
    private Date sellOutTime;

    /**
     * 浏览量（商品点击量）
     */
    @Column(name = "view_num")
    private Long viewNum;

    @Column(name = "content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Date getGroundTime() {
        return groundTime;
    }

    public void setGroundTime(Date groundTime) {
        this.groundTime = groundTime;
        if (groundTime == null) this.setGroundTimeLabel("");
        else this.setGroundTimeLabel(DateUtils.format(groundTime));
    }

    public Date getUndercarriageTime() {
        return undercarriageTime;
    }

    public void setUndercarriageTime(Date undercarriageTime) {
        this.undercarriageTime = undercarriageTime;
        if (undercarriageTime == null) this.setUndercarriageTimeLabel("");
        else this.setGroundTimeLabel(DateUtils.format(undercarriageTime));
    }

    public String getGroundTimeLabel() {
        return groundTimeLabel;
    }

    public void setGroundTimeLabel(String groundTimeLabel) {
        this.groundTimeLabel = groundTimeLabel;
    }

    public String getUndercarriageTimeLabel() {
        return undercarriageTimeLabel;
    }

    public void setUndercarriageTimeLabel(String undercarriageTimeLabel) {
        this.undercarriageTimeLabel = undercarriageTimeLabel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getBuyNowNumber() {
        return buyNowNumber;
    }

    public void setBuyNowNumber(Integer buyNowNumber) {
        this.buyNowNumber = buyNowNumber;
    }

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名
     *
     * @return name - 商品名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名
     *
     * @param name 商品名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取商品描述
     *
     * @return commodity_desc - 商品描述
     */
    public String getCommodityDesc() {
        return commodityDesc;
    }

    /**
     * 设置商品描述
     *
     * @param commodityDesc 商品描述
     */
    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc == null ? null : commodityDesc.trim();
    }

    /**
     * 获取商品类型id
     *
     * @return commodity_type_id - 商品类型id
     */
    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型id
     *
     * @param commodityTypeId 商品类型id
     */
    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取商品类别（1：实体，0：虚拟）
     *
     * @return genre - 商品类别（1：实体，0：虚拟）
     */
    public Integer getGenre() {
        return genre;
    }

    /**
     * 设置商品类别（1：实体，0：虚拟）
     *
     * @param genre 商品类别（1：实体，0：虚拟）
     */
    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    /**
     * 获取上一次购买人次
     *
     * @return buy_last_number - 上一次购买人次
     */
    public Integer getBuyLastNumber() {
        return buyLastNumber;
    }

    /**
     * 设置上一次购买人次
     *
     * @param buyLastNumber 上一次购买人次
     */
    public void setBuyLastNumber(Integer buyLastNumber) {
        this.buyLastNumber = buyLastNumber;
    }

    /**
     * 获取当前购买人次
     *
     * @return buy_current_number - 当前购买人次
     */
    public Integer getBuyCurrentNumber() {
        return buyCurrentNumber;
    }

    /**
     * 设置当前购买人次
     *
     * @param buyCurrentNumber 当前购买人次
     */
    public void setBuyCurrentNumber(Integer buyCurrentNumber) {
        this.buyCurrentNumber = buyCurrentNumber;
    }

    /**
     * 获取总购买人次
     *
     * @return buy_total_number - 总购买人次
     */
    public Integer getBuyTotalNumber() {
        return buyTotalNumber;
    }

    /**
     * 设置总购买人次
     *
     * @param buyTotalNumber 总购买人次
     */
    public void setBuyTotalNumber(Integer buyTotalNumber) {
        this.buyTotalNumber = buyTotalNumber;
    }

    /**
     * 获取开抢时间
     *
     * @return start_time - 开抢时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开抢时间
     *
     * @param startTime 开抢时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取中奖幸运码id
     *
     * @return luck_code_id - 中奖幸运码id
     */
    public Long getLuckCodeId() {
        return luckCodeId;
    }

    /**
     * 设置中奖幸运码id
     *
     * @param luckCodeId 中奖幸运码id
     */
    public void setLuckCodeId(Long luckCodeId) {
        this.luckCodeId = luckCodeId;
    }

    /**
     * 获取当前期数
     *
     * @return round_time - 当前期数
     */
    public String getRoundTime() {
        return roundTime;
    }

    /**
     * 设置当前期数
     *
     * @param roundTime 当前期数
     */
    public void setRoundTime(String roundTime) {
        this.roundTime = roundTime == null ? null : roundTime.trim();
    }

    /**
     * 获取封面图片id
     *
     * @return cover_img_url - 封面图片id
     */
    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    /**
     * 设置封面图片id
     *
     * @param coverImgUrl 封面图片id
     */
    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl == null ? null : coverImgUrl.trim();
    }

    /**
     * 获取是否自动生成下一期（1：是，0：否）
     *
     * @return auto_round - 是否自动生成下一期（1：是，0：否）
     */
    public Integer getAutoRound() {
        return autoRound;
    }

    /**
     * 设置是否自动生成下一期（1：是，0：否）
     *
     * @param autoRound 是否自动生成下一期（1：是，0：否）
     */
    public void setAutoRound(Integer autoRound) {
        this.autoRound = autoRound;
    }

    /**
     * 获取商品详情URL
     *
     * @return commodity_desc_url - 商品详情URL
     */
    public String getCommodityDescUrl() {
        return commodityDescUrl;
    }

    /**
     * 设置商品详情URL
     *
     * @param commodityDescUrl 商品详情URL
     */
    public void setCommodityDescUrl(String commodityDescUrl) {
        this.commodityDescUrl = commodityDescUrl == null ? null : commodityDescUrl.trim();
    }

    /**
     * 获取售罄时间
     *
     * @return sell_out_time - 售罄时间
     */
    public Date getSellOutTime() {
        return sellOutTime;
    }

    /**
     * 设置售罄时间
     *
     * @param sellOutTime 售罄时间
     */
    public void setSellOutTime(Date sellOutTime) {
        this.sellOutTime = sellOutTime;
    }

    public Long getViewNum() {
        return viewNum;
    }

    public void setViewNum(Long viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getCardNum() {
        return cardNum;
    }

    public void setCardNum(Integer cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(Integer cardMoney) {
        this.cardMoney = cardMoney;
    }
}