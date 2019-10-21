package com.tatayab.tatayab.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeaturedProductResponseParser {

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
    @SerializedName("products")
    @Expose
    private List<Product> products = null;

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    public class Detailed {

        @SerializedName("object_id")
        @Expose
        private String objectId;
        @SerializedName("object_type")
        @Expose
        private String objectType;
        @SerializedName("type")
        @Expose
        private String type;
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

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String getObjectType() {
            return objectType;
        }

        public void setObjectType(String objectType) {
            this.objectType = objectType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

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

    public class ImagePair {

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
        @SerializedName("detailed")
        @Expose
        private Detailed detailed;

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

        public Detailed getDetailed() {
            return detailed;
        }

        public void setDetailed(Detailed detailed) {
            this.detailed = detailed;
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


    public class Product {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image_pair")
        @Expose
        private ImagePair imagePair;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public ImagePair getImagePair() {
            return imagePair;
        }

        public void setImagePair(ImagePair imagePair) {
            this.imagePair = imagePair;
        }

    }


    public class Properties {

        @SerializedName("template")
        @Expose
        private String template;
        @SerializedName("not_scroll_automatically")
        @Expose
        private String notScrollAutomatically;
        @SerializedName("scroll_per_page")
        @Expose
        private String scrollPerPage;
        @SerializedName("speed")
        @Expose
        private String speed;
        @SerializedName("pause_delay")
        @Expose
        private String pauseDelay;
        @SerializedName("item_quantity")
        @Expose
        private String itemQuantity;
        @SerializedName("hide_add_to_cart_button")
        @Expose
        private String hideAddToCartButton;

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public String getNotScrollAutomatically() {
            return notScrollAutomatically;
        }

        public void setNotScrollAutomatically(String notScrollAutomatically) {
            this.notScrollAutomatically = notScrollAutomatically;
        }

        public String getScrollPerPage() {
            return scrollPerPage;
        }

        public void setScrollPerPage(String scrollPerPage) {
            this.scrollPerPage = scrollPerPage;
        }

        public String getSpeed() {
            return speed;
        }

        public void setSpeed(String speed) {
            this.speed = speed;
        }

        public String getPauseDelay() {
            return pauseDelay;
        }

        public void setPauseDelay(String pauseDelay) {
            this.pauseDelay = pauseDelay;
        }

        public String getItemQuantity() {
            return itemQuantity;
        }

        public void setItemQuantity(String itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public String getHideAddToCartButton() {
            return hideAddToCartButton;
        }

        public void setHideAddToCartButton(String hideAddToCartButton) {
            this.hideAddToCartButton = hideAddToCartButton;
        }

    }
}
