package com.tatayab.tatayab.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BannerResponseParser {

    @SerializedName("block_id")
    @Expose
    private String blockId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("properties")
    @Expose
    private Properties properties;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("lang_code")
    @Expose
    private String langCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("banners")
    @Expose
    private List<Banner> banners = null;

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }




public class Banner {

    @SerializedName("banner_id")
    @Expose
    private String bannerId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("banner")
    @Expose
    private String banner;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("target")
    @Expose
    private String target;
    @SerializedName("localization")
    @Expose
    private String localization;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("banner_image_id")
    @Expose
    private String bannerImageId;
    @SerializedName("company_id")
    @Expose
    private String companyId;
    @SerializedName("ab__title")
    @Expose
    private String abTitle;
    @SerializedName("ab__adv_text")
    @Expose
    private String abAdvText;
    @SerializedName("ab__button_text")
    @Expose
    private String abButtonText;
    @SerializedName("ab__bg_color")
    @Expose
    private String abBgColor;
    @SerializedName("ab__color_scheme")
    @Expose
    private String abColorScheme;
    @SerializedName("main_pair")
    @Expose
    private MainPair mainPair;
    @SerializedName("bg_image")
    @Expose
    private List<Object> bgImage = null;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBannerImageId() {
        return bannerImageId;
    }

    public void setBannerImageId(String bannerImageId) {
        this.bannerImageId = bannerImageId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getAbTitle() {
        return abTitle;
    }

    public void setAbTitle(String abTitle) {
        this.abTitle = abTitle;
    }

    public String getAbAdvText() {
        return abAdvText;
    }

    public void setAbAdvText(String abAdvText) {
        this.abAdvText = abAdvText;
    }

    public String getAbButtonText() {
        return abButtonText;
    }

    public void setAbButtonText(String abButtonText) {
        this.abButtonText = abButtonText;
    }

    public String getAbBgColor() {
        return abBgColor;
    }

    public void setAbBgColor(String abBgColor) {
        this.abBgColor = abBgColor;
    }

    public String getAbColorScheme() {
        return abColorScheme;
    }

    public void setAbColorScheme(String abColorScheme) {
        this.abColorScheme = abColorScheme;
    }

    public MainPair getMainPair() {
        return mainPair;
    }

    public void setMainPair(MainPair mainPair) {
        this.mainPair = mainPair;
    }

    public List<Object> getBgImage() {
        return bgImage;
    }

    public void setBgImage(List<Object> bgImage) {
        this.bgImage = bgImage;
    }

}



public class Content {

    @SerializedName("items")
    @Expose
    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

}

public class Icon {

    @SerializedName("image_path")
    @Expose
    private String imagePath;
    @SerializedName("alt")
    @Expose
    private String alt;
    @SerializedName("image_x")
    @Expose
    private String imageX;
    @SerializedName("image_y")
    @Expose
    private String imageY;
    @SerializedName("http_image_path")
    @Expose
    private String httpImagePath;
    @SerializedName("https_image_path")
    @Expose
    private String httpsImagePath;
    @SerializedName("absolute_path")
    @Expose
    private String absolutePath;
    @SerializedName("relative_path")
    @Expose
    private String relativePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getImageX() {
        return imageX;
    }

    public void setImageX(String imageX) {
        this.imageX = imageX;
    }

    public String getImageY() {
        return imageY;
    }

    public void setImageY(String imageY) {
        this.imageY = imageY;
    }

    public String getHttpImagePath() {
        return httpImagePath;
    }

    public void setHttpImagePath(String httpImagePath) {
        this.httpImagePath = httpImagePath;
    }

    public String getHttpsImagePath() {
        return httpsImagePath;
    }

    public void setHttpsImagePath(String httpsImagePath) {
        this.httpsImagePath = httpsImagePath;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

}

public class Items {

    @SerializedName("filling")
    @Expose
    private String filling;
    @SerializedName("item_ids")
    @Expose
    private String itemIds;

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getItemIds() {
        return itemIds;
    }

    public void setItemIds(String itemIds) {
        this.itemIds = itemIds;
    }

}


public class MainPair {

    @SerializedName("pair_id")
    @Expose
    private String pairId;
    @SerializedName("image_id")
    @Expose
    private String imageId;
    @SerializedName("detailed_id")
    @Expose
    private String detailedId;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("icon")
    @Expose
    private Icon icon;

    public String getPairId() {
        return pairId;
    }

    public void setPairId(String pairId) {
        this.pairId = pairId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getDetailedId() {
        return detailedId;
    }

    public void setDetailedId(String detailedId) {
        this.detailedId = detailedId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}

public class Properties {

    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("navigation")
    @Expose
    private String navigation;
    @SerializedName("delay")
    @Expose
    private String delay;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

}

}