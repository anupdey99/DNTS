
package com.example.anup.dnts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Voucher {

    @SerializedName("DealId")
    @Expose
    private Integer dealId;
    @SerializedName("DealTitle")
    @Expose
    private String dealTitle;
    @SerializedName("QtnLimitPerUser")
    @Expose
    private Integer qtnLimitPerUser;
    @SerializedName("FolderName")
    @Expose
    private String folderName;
    @SerializedName("ImageLink")
    @Expose
    private String imageLink;
    @SerializedName("ShortDescription")
    @Expose
    private String shortDescription;
    @SerializedName("CustomizeRateChart")
    @Expose
    private Object customizeRateChart;
    @SerializedName("TermsCondition")
    @Expose
    private Object termsCondition;
    @SerializedName("AccountsTitle")
    @Expose
    private String accountsTitle;
    @SerializedName("Sizes")
    @Expose
    private String sizes;
    @SerializedName("Colors")
    @Expose
    private Object colors;
    @SerializedName("RegularPrice")
    @Expose
    private Integer regularPrice;
    @SerializedName("DealPrice")
    @Expose
    private Integer dealPrice;
    @SerializedName("CouponPrice")
    @Expose
    private Integer couponPrice;
    @SerializedName("CommissionPerCoupon")
    @Expose
    private Integer commissionPerCoupon;
    @SerializedName("DeliveryCharge")
    @Expose
    private Integer deliveryCharge;
    @SerializedName("IsSoldOut")
    @Expose
    private Boolean isSoldOut;
    @SerializedName("ProfileId")
    @Expose
    private Integer profileId;
    @SerializedName("UseScanImage")
    @Expose
    private Boolean useScanImage;
    @SerializedName("IsDealClosed")
    @Expose
    private Boolean isDealClosed;
    @SerializedName("ImageCount")
    @Expose
    private Integer imageCount;
    @SerializedName("MerchantInsideDhakaSpeed")
    @Expose
    private Integer merchantInsideDhakaSpeed;
    @SerializedName("MerchantOutsideDhakaSpeed")
    @Expose
    private Integer merchantOutsideDhakaSpeed;
    @SerializedName("DeliveryChargeAmount")
    @Expose
    private Integer deliveryChargeAmount;
    @SerializedName("DeliveryChargeAmountOutSideDhaka")
    @Expose
    private Integer deliveryChargeAmountOutSideDhaka;
    @SerializedName("ImageExt")
    @Expose
    private Object imageExt;
    @SerializedName("CategoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("SubCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("SubSubCategoryID")
    @Expose
    private Integer subSubCategoryID;
    @SerializedName("BulletDescription")
    @Expose
    private String bulletDescription;
    @SerializedName("DeliveryPaymentProcess")
    @Expose
    private Object deliveryPaymentProcess;
    @SerializedName("BulletAboutSellers")
    @Expose
    private Object bulletAboutSellers;
    @SerializedName("BulletTermsCondition")
    @Expose
    private Object bulletTermsCondition;
    @SerializedName("MotherDealId")
    @Expose
    private Integer motherDealId;
    @SerializedName("IsHotDeal")
    @Expose
    private Boolean isHotDeal;
    @SerializedName("Category")
    @Expose
    private Object category;
    @SerializedName("CategoryEng")
    @Expose
    private Object categoryEng;
    @SerializedName("Subcategory")
    @Expose
    private Object subcategory;
    @SerializedName("SubcategoryEng")
    @Expose
    private Object subcategoryEng;
    @SerializedName("CompanyName")
    @Expose
    private Object companyName;
    @SerializedName("CompanyNameBng")
    @Expose
    private Object companyNameBng;
    @SerializedName("TotalOrder")
    @Expose
    private Integer totalOrder;
    @SerializedName("TotalReview")
    @Expose
    private Integer totalReview;
    @SerializedName("GoodProductQuality")
    @Expose
    private Integer goodProductQuality;
    @SerializedName("BadProductQuality")
    @Expose
    private Integer badProductQuality;
    @SerializedName("DeliverySpeedDhaka")
    @Expose
    private Integer deliverySpeedDhaka;
    @SerializedName("DeliverySpeedOutSideDhaka")
    @Expose
    private Integer deliverySpeedOutSideDhaka;
    @SerializedName("AwardName")
    @Expose
    private Object awardName;
    @SerializedName("AwardValue")
    @Expose
    private Integer awardValue;
    @SerializedName("AwardType")
    @Expose
    private Integer awardType;
    @SerializedName("TotalPoint")
    @Expose
    private Integer totalPoint;
    @SerializedName("DeliverySpeedDhakaPercentage")
    @Expose
    private Integer deliverySpeedDhakaPercentage;
    @SerializedName("DeliverySpeedOutDhakaPercentage")
    @Expose
    private Integer deliverySpeedOutDhakaPercentage;
    @SerializedName("ReviewPercentage")
    @Expose
    private Integer reviewPercentage;
    @SerializedName("DeliverySpeedStarRating")
    @Expose
    private Integer deliverySpeedStarRating;
    @SerializedName("ProductQualityStarRating")
    @Expose
    private Integer productQualityStarRating;
    @SerializedName("IsCompanyClosed")
    @Expose
    private Integer isCompanyClosed;
    @SerializedName("MerchantTotalOrder")
    @Expose
    private Integer merchantTotalOrder;
    @SerializedName("MerchantTotalReview")
    @Expose
    private Integer merchantTotalReview;
    @SerializedName("InsertedOn")
    @Expose
    private String insertedOn;
    @SerializedName("ProductSize")
    @Expose
    private String productSize;

    public Integer getDealId() {
        return dealId;
    }

    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }

    public String getDealTitle() {
        return dealTitle;
    }

    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }

    public Integer getQtnLimitPerUser() {
        return qtnLimitPerUser;
    }

    public void setQtnLimitPerUser(Integer qtnLimitPerUser) {
        this.qtnLimitPerUser = qtnLimitPerUser;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Object getCustomizeRateChart() {
        return customizeRateChart;
    }

    public void setCustomizeRateChart(Object customizeRateChart) {
        this.customizeRateChart = customizeRateChart;
    }

    public Object getTermsCondition() {
        return termsCondition;
    }

    public void setTermsCondition(Object termsCondition) {
        this.termsCondition = termsCondition;
    }

    public String getAccountsTitle() {
        return accountsTitle;
    }

    public void setAccountsTitle(String accountsTitle) {
        this.accountsTitle = accountsTitle;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public Object getColors() {
        return colors;
    }

    public void setColors(Object colors) {
        this.colors = colors;
    }

    public Integer getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(Integer regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Integer getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Integer dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Integer getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(Integer couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getCommissionPerCoupon() {
        return commissionPerCoupon;
    }

    public void setCommissionPerCoupon(Integer commissionPerCoupon) {
        this.commissionPerCoupon = commissionPerCoupon;
    }

    public Integer getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(Integer deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public Boolean getUseScanImage() {
        return useScanImage;
    }

    public void setUseScanImage(Boolean useScanImage) {
        this.useScanImage = useScanImage;
    }

    public Boolean getIsDealClosed() {
        return isDealClosed;
    }

    public void setIsDealClosed(Boolean isDealClosed) {
        this.isDealClosed = isDealClosed;
    }

    public Integer getImageCount() {
        return imageCount;
    }

    public void setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
    }

    public Integer getMerchantInsideDhakaSpeed() {
        return merchantInsideDhakaSpeed;
    }

    public void setMerchantInsideDhakaSpeed(Integer merchantInsideDhakaSpeed) {
        this.merchantInsideDhakaSpeed = merchantInsideDhakaSpeed;
    }

    public Integer getMerchantOutsideDhakaSpeed() {
        return merchantOutsideDhakaSpeed;
    }

    public void setMerchantOutsideDhakaSpeed(Integer merchantOutsideDhakaSpeed) {
        this.merchantOutsideDhakaSpeed = merchantOutsideDhakaSpeed;
    }

    public Integer getDeliveryChargeAmount() {
        return deliveryChargeAmount;
    }

    public void setDeliveryChargeAmount(Integer deliveryChargeAmount) {
        this.deliveryChargeAmount = deliveryChargeAmount;
    }

    public Integer getDeliveryChargeAmountOutSideDhaka() {
        return deliveryChargeAmountOutSideDhaka;
    }

    public void setDeliveryChargeAmountOutSideDhaka(Integer deliveryChargeAmountOutSideDhaka) {
        this.deliveryChargeAmountOutSideDhaka = deliveryChargeAmountOutSideDhaka;
    }

    public Object getImageExt() {
        return imageExt;
    }

    public void setImageExt(Object imageExt) {
        this.imageExt = imageExt;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getSubSubCategoryID() {
        return subSubCategoryID;
    }

    public void setSubSubCategoryID(Integer subSubCategoryID) {
        this.subSubCategoryID = subSubCategoryID;
    }

    public String getBulletDescription() {
        return bulletDescription;
    }

    public void setBulletDescription(String bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    public Object getDeliveryPaymentProcess() {
        return deliveryPaymentProcess;
    }

    public void setDeliveryPaymentProcess(Object deliveryPaymentProcess) {
        this.deliveryPaymentProcess = deliveryPaymentProcess;
    }

    public Object getBulletAboutSellers() {
        return bulletAboutSellers;
    }

    public void setBulletAboutSellers(Object bulletAboutSellers) {
        this.bulletAboutSellers = bulletAboutSellers;
    }

    public Object getBulletTermsCondition() {
        return bulletTermsCondition;
    }

    public void setBulletTermsCondition(Object bulletTermsCondition) {
        this.bulletTermsCondition = bulletTermsCondition;
    }

    public Integer getMotherDealId() {
        return motherDealId;
    }

    public void setMotherDealId(Integer motherDealId) {
        this.motherDealId = motherDealId;
    }

    public Boolean getIsHotDeal() {
        return isHotDeal;
    }

    public void setIsHotDeal(Boolean isHotDeal) {
        this.isHotDeal = isHotDeal;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Object getCategoryEng() {
        return categoryEng;
    }

    public void setCategoryEng(Object categoryEng) {
        this.categoryEng = categoryEng;
    }

    public Object getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Object subcategory) {
        this.subcategory = subcategory;
    }

    public Object getSubcategoryEng() {
        return subcategoryEng;
    }

    public void setSubcategoryEng(Object subcategoryEng) {
        this.subcategoryEng = subcategoryEng;
    }

    public Object getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Object companyName) {
        this.companyName = companyName;
    }

    public Object getCompanyNameBng() {
        return companyNameBng;
    }

    public void setCompanyNameBng(Object companyNameBng) {
        this.companyNameBng = companyNameBng;
    }

    public Integer getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Integer getTotalReview() {
        return totalReview;
    }

    public void setTotalReview(Integer totalReview) {
        this.totalReview = totalReview;
    }

    public Integer getGoodProductQuality() {
        return goodProductQuality;
    }

    public void setGoodProductQuality(Integer goodProductQuality) {
        this.goodProductQuality = goodProductQuality;
    }

    public Integer getBadProductQuality() {
        return badProductQuality;
    }

    public void setBadProductQuality(Integer badProductQuality) {
        this.badProductQuality = badProductQuality;
    }

    public Integer getDeliverySpeedDhaka() {
        return deliverySpeedDhaka;
    }

    public void setDeliverySpeedDhaka(Integer deliverySpeedDhaka) {
        this.deliverySpeedDhaka = deliverySpeedDhaka;
    }

    public Integer getDeliverySpeedOutSideDhaka() {
        return deliverySpeedOutSideDhaka;
    }

    public void setDeliverySpeedOutSideDhaka(Integer deliverySpeedOutSideDhaka) {
        this.deliverySpeedOutSideDhaka = deliverySpeedOutSideDhaka;
    }

    public Object getAwardName() {
        return awardName;
    }

    public void setAwardName(Object awardName) {
        this.awardName = awardName;
    }

    public Integer getAwardValue() {
        return awardValue;
    }

    public void setAwardValue(Integer awardValue) {
        this.awardValue = awardValue;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public Integer getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Integer totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Integer getDeliverySpeedDhakaPercentage() {
        return deliverySpeedDhakaPercentage;
    }

    public void setDeliverySpeedDhakaPercentage(Integer deliverySpeedDhakaPercentage) {
        this.deliverySpeedDhakaPercentage = deliverySpeedDhakaPercentage;
    }

    public Integer getDeliverySpeedOutDhakaPercentage() {
        return deliverySpeedOutDhakaPercentage;
    }

    public void setDeliverySpeedOutDhakaPercentage(Integer deliverySpeedOutDhakaPercentage) {
        this.deliverySpeedOutDhakaPercentage = deliverySpeedOutDhakaPercentage;
    }

    public Integer getReviewPercentage() {
        return reviewPercentage;
    }

    public void setReviewPercentage(Integer reviewPercentage) {
        this.reviewPercentage = reviewPercentage;
    }

    public Integer getDeliverySpeedStarRating() {
        return deliverySpeedStarRating;
    }

    public void setDeliverySpeedStarRating(Integer deliverySpeedStarRating) {
        this.deliverySpeedStarRating = deliverySpeedStarRating;
    }

    public Integer getProductQualityStarRating() {
        return productQualityStarRating;
    }

    public void setProductQualityStarRating(Integer productQualityStarRating) {
        this.productQualityStarRating = productQualityStarRating;
    }

    public Integer getIsCompanyClosed() {
        return isCompanyClosed;
    }

    public void setIsCompanyClosed(Integer isCompanyClosed) {
        this.isCompanyClosed = isCompanyClosed;
    }

    public Integer getMerchantTotalOrder() {
        return merchantTotalOrder;
    }

    public void setMerchantTotalOrder(Integer merchantTotalOrder) {
        this.merchantTotalOrder = merchantTotalOrder;
    }

    public Integer getMerchantTotalReview() {
        return merchantTotalReview;
    }

    public void setMerchantTotalReview(Integer merchantTotalReview) {
        this.merchantTotalReview = merchantTotalReview;
    }

    public String getInsertedOn() {
        return insertedOn;
    }

    public void setInsertedOn(String insertedOn) {
        this.insertedOn = insertedOn;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

}
