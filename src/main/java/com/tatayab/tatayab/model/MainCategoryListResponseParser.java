package com.tatayab.tatayab.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.List;

public class MainCategoryListResponseParser {


    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("params")
    @Expose
    private Params params;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }



    public class Category {

        @SerializedName("category_id")
        @Expose
        private String categoryId;
        @SerializedName("parent_id")
        @Expose
        private String parentId;
        @SerializedName("id_path")
        @Expose
        private String idPath;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("position")
        @Expose
        private String position;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("product_count")
        @Expose
        private String productCount;
        @SerializedName("company_id")
        @Expose
        private String companyId;
        @SerializedName("seo_name")
        @Expose
        private String seoName;
        @SerializedName("seo_path")
        @Expose
        private String seoPath;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("image_path")
        @Expose
        private String imagePath;
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

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getIdPath() {
            return idPath;
        }

        public void setIdPath(String idPath) {
            this.idPath = idPath;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getProductCount() {
            return productCount;
        }

        public void setProductCount(String productCount) {
            this.productCount = productCount;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public String getSeoName() {
            return seoName;
        }

        public void setSeoName(String seoName) {
            this.seoName = seoName;
        }

        public String getSeoPath() {
            return seoPath;
        }

        public void setSeoPath(String seoPath) {
            this.seoPath = seoPath;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
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

    public class Params {

        @SerializedName("category_id")
        @Expose
        private Integer categoryId;
        @SerializedName("visible")
        @Expose
        private Boolean visible;
        @SerializedName("current_category_id")
        @Expose
        private Integer currentCategoryId;
        @SerializedName("simple")
        @Expose
        private Boolean simple;
        @SerializedName("plain")
        @Expose
        private Boolean plain;
        @SerializedName("limit")
        @Expose
        private Integer limit;
        @SerializedName("item_ids")
        @Expose
        private String itemIds;
        @SerializedName("group_by_level")
        @Expose
        private Boolean groupByLevel;
        @SerializedName("get_images")
        @Expose
        private Boolean getImages;
        @SerializedName("category_delimiter")
        @Expose
        private String categoryDelimiter;
        @SerializedName("get_frontend_urls")
        @Expose
        private Boolean getFrontendUrls;
        @SerializedName("max_nesting_level")
        @Expose
        private Object maxNestingLevel;
        @SerializedName("get_company_name")
        @Expose
        private Boolean getCompanyName;
        @SerializedName("ajax_custom")
        @Expose
        private String ajaxCustom;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("items_per_page")
        @Expose
        private Integer itemsPerPage;
        @SerializedName("page")
        @Expose
        private Integer page;
        @SerializedName("sort_order")
        @Expose
        private String sortOrder;
        @SerializedName("sort_by")
        @Expose
        private String sortBy;
        @SerializedName("sort_order_rev")
        @Expose
        private String sortOrderRev;

        public Integer getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
        }

        public Boolean getVisible() {
            return visible;
        }

        public void setVisible(Boolean visible) {
            this.visible = visible;
        }

        public Integer getCurrentCategoryId() {
            return currentCategoryId;
        }

        public void setCurrentCategoryId(Integer currentCategoryId) {
            this.currentCategoryId = currentCategoryId;
        }

        public Boolean getSimple() {
            return simple;
        }

        public void setSimple(Boolean simple) {
            this.simple = simple;
        }

        public Boolean getPlain() {
            return plain;
        }

        public void setPlain(Boolean plain) {
            this.plain = plain;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public String getItemIds() {
            return itemIds;
        }

        public void setItemIds(String itemIds) {
            this.itemIds = itemIds;
        }

        public Boolean getGroupByLevel() {
            return groupByLevel;
        }

        public void setGroupByLevel(Boolean groupByLevel) {
            this.groupByLevel = groupByLevel;
        }

        public Boolean getGetImages() {
            return getImages;
        }

        public void setGetImages(Boolean getImages) {
            this.getImages = getImages;
        }

        public String getCategoryDelimiter() {
            return categoryDelimiter;
        }

        public void setCategoryDelimiter(String categoryDelimiter) {
            this.categoryDelimiter = categoryDelimiter;
        }

        public Boolean getGetFrontendUrls() {
            return getFrontendUrls;
        }

        public void setGetFrontendUrls(Boolean getFrontendUrls) {
            this.getFrontendUrls = getFrontendUrls;
        }

        public Object getMaxNestingLevel() {
            return maxNestingLevel;
        }

        public void setMaxNestingLevel(Object maxNestingLevel) {
            this.maxNestingLevel = maxNestingLevel;
        }

        public Boolean getGetCompanyName() {
            return getCompanyName;
        }

        public void setGetCompanyName(Boolean getCompanyName) {
            this.getCompanyName = getCompanyName;
        }

        public String getAjaxCustom() {
            return ajaxCustom;
        }

        public void setAjaxCustom(String ajaxCustom) {
            this.ajaxCustom = ajaxCustom;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Integer getItemsPerPage() {
            return itemsPerPage;
        }

        public void setItemsPerPage(Integer itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
        }

        public Integer getPage() {
            return page;
        }

        public void setPage(Integer page) {
            this.page = page;
        }

        public String getSortOrder() {
            return sortOrder;
        }

        public void setSortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
        }

        public String getSortBy() {
            return sortBy;
        }

        public void setSortBy(String sortBy) {
            this.sortBy = sortBy;
        }

        public String getSortOrderRev() {
            return sortOrderRev;
        }

        public void setSortOrderRev(String sortOrderRev) {
            this.sortOrderRev = sortOrderRev;
        }

    }
}
