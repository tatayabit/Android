package com.tatayab.tatayab.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseParser {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("user_profile")
    @Expose
    private UserProfile userProfile;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public class UserProfile {

        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("user_login")
        @Expose
        private String userLogin;
        @SerializedName("referer")
        @Expose
        private String referer;
        @SerializedName("is_root")
        @Expose
        private String isRoot;
        @SerializedName("company_id")
        @Expose
        private String companyId;
        @SerializedName("last_login")
        @Expose
        private String lastLogin;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("salt")
        @Expose
        private String salt;
        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("lastname")
        @Expose
        private String lastname;
        @SerializedName("company")
        @Expose
        private String company;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("fax")
        @Expose
        private String fax;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("tax_exempt")
        @Expose
        private String taxExempt;
        @SerializedName("lang_code")
        @Expose
        private String langCode;
        @SerializedName("birthday")
        @Expose
        private String birthday;
        @SerializedName("purchase_timestamp_from")
        @Expose
        private String purchaseTimestampFrom;
        @SerializedName("purchase_timestamp_to")
        @Expose
        private String purchaseTimestampTo;
        @SerializedName("responsible_email")
        @Expose
        private String responsibleEmail;
        @SerializedName("last_passwords")
        @Expose
        private String lastPasswords;
        @SerializedName("password_change_timestamp")
        @Expose
        private String passwordChangeTimestamp;
        @SerializedName("api_key")
        @Expose
        private String apiKey;
        @SerializedName("janrain_identifier")
        @Expose
        private String janrainIdentifier;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;
        @SerializedName("am_subscribe")
        @Expose
        private String amSubscribe;
        @SerializedName("from_app")
        @Expose
        private String fromApp;
        @SerializedName("app_device")
        @Expose
        private String appDevice;
        @SerializedName("partner_id")
        @Expose
        private String partnerId;
        @SerializedName("usergroups")
        @Expose
        private Object usergroups;
        @SerializedName("profile_id")
        @Expose
        private String profileId;
        @SerializedName("profile_type")
        @Expose
        private String profileType;
        @SerializedName("b_firstname")
        @Expose
        private String bFirstname;
        @SerializedName("b_lastname")
        @Expose
        private String bLastname;
        @SerializedName("b_address")
        @Expose
        private String bAddress;
        @SerializedName("b_address_2")
        @Expose
        private String bAddress2;
        @SerializedName("b_city")
        @Expose
        private String bCity;
        @SerializedName("b_county")
        @Expose
        private String bCounty;
        @SerializedName("b_state")
        @Expose
        private String bState;
        @SerializedName("b_country")
        @Expose
        private String bCountry;
        @SerializedName("b_zipcode")
        @Expose
        private String bZipcode;
        @SerializedName("b_phone")
        @Expose
        private String bPhone;
        @SerializedName("s_firstname")
        @Expose
        private String sFirstname;
        @SerializedName("s_lastname")
        @Expose
        private String sLastname;
        @SerializedName("s_address")
        @Expose
        private String sAddress;
        @SerializedName("s_address_2")
        @Expose
        private String sAddress2;
        @SerializedName("s_city")
        @Expose
        private String sCity;
        @SerializedName("s_county")
        @Expose
        private String sCounty;
        @SerializedName("s_state")
        @Expose
        private String sState;
        @SerializedName("s_country")
        @Expose
        private String sCountry;
        @SerializedName("s_zipcode")
        @Expose
        private String sZipcode;
        @SerializedName("s_phone")
        @Expose
        private String sPhone;
        @SerializedName("s_address_type")
        @Expose
        private String sAddressType;
        @SerializedName("profile_name")
        @Expose
        private String profileName;
        @SerializedName("fields")
        @Expose
        private Object fields;
        @SerializedName("b_country_descr")
        @Expose
        private String bCountryDescr;
        @SerializedName("s_country_descr")
        @Expose
        private String sCountryDescr;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public String getUserLogin() {
            return userLogin;
        }

        public void setUserLogin(String userLogin) {
            this.userLogin = userLogin;
        }

        public String getReferer() {
            return referer;
        }

        public void setReferer(String referer) {
            this.referer = referer;
        }

        public String getIsRoot() {
            return isRoot;
        }

        public void setIsRoot(String isRoot) {
            this.isRoot = isRoot;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public String getLastLogin() {
            return lastLogin;
        }

        public void setLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTaxExempt() {
            return taxExempt;
        }

        public void setTaxExempt(String taxExempt) {
            this.taxExempt = taxExempt;
        }

        public String getLangCode() {
            return langCode;
        }

        public void setLangCode(String langCode) {
            this.langCode = langCode;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getPurchaseTimestampFrom() {
            return purchaseTimestampFrom;
        }

        public void setPurchaseTimestampFrom(String purchaseTimestampFrom) {
            this.purchaseTimestampFrom = purchaseTimestampFrom;
        }

        public String getPurchaseTimestampTo() {
            return purchaseTimestampTo;
        }

        public void setPurchaseTimestampTo(String purchaseTimestampTo) {
            this.purchaseTimestampTo = purchaseTimestampTo;
        }

        public String getResponsibleEmail() {
            return responsibleEmail;
        }

        public void setResponsibleEmail(String responsibleEmail) {
            this.responsibleEmail = responsibleEmail;
        }

        public String getLastPasswords() {
            return lastPasswords;
        }

        public void setLastPasswords(String lastPasswords) {
            this.lastPasswords = lastPasswords;
        }

        public String getPasswordChangeTimestamp() {
            return passwordChangeTimestamp;
        }

        public void setPasswordChangeTimestamp(String passwordChangeTimestamp) {
            this.passwordChangeTimestamp = passwordChangeTimestamp;
        }

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getJanrainIdentifier() {
            return janrainIdentifier;
        }

        public void setJanrainIdentifier(String janrainIdentifier) {
            this.janrainIdentifier = janrainIdentifier;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getAmSubscribe() {
            return amSubscribe;
        }

        public void setAmSubscribe(String amSubscribe) {
            this.amSubscribe = amSubscribe;
        }

        public String getFromApp() {
            return fromApp;
        }

        public void setFromApp(String fromApp) {
            this.fromApp = fromApp;
        }

        public String getAppDevice() {
            return appDevice;
        }

        public void setAppDevice(String appDevice) {
            this.appDevice = appDevice;
        }

        public String getPartnerId() {
            return partnerId;
        }

        public void setPartnerId(String partnerId) {
            this.partnerId = partnerId;
        }

        public Object getUsergroups() {
            return usergroups;
        }

        public void setUsergroups(Object usergroups) {
            this.usergroups = usergroups;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

        public String getProfileType() {
            return profileType;
        }

        public void setProfileType(String profileType) {
            this.profileType = profileType;
        }

        public String getBFirstname() {
            return bFirstname;
        }

        public void setBFirstname(String bFirstname) {
            this.bFirstname = bFirstname;
        }

        public String getBLastname() {
            return bLastname;
        }

        public void setBLastname(String bLastname) {
            this.bLastname = bLastname;
        }

        public String getBAddress() {
            return bAddress;
        }

        public void setBAddress(String bAddress) {
            this.bAddress = bAddress;
        }

        public String getBAddress2() {
            return bAddress2;
        }

        public void setBAddress2(String bAddress2) {
            this.bAddress2 = bAddress2;
        }

        public String getBCity() {
            return bCity;
        }

        public void setBCity(String bCity) {
            this.bCity = bCity;
        }

        public String getBCounty() {
            return bCounty;
        }

        public void setBCounty(String bCounty) {
            this.bCounty = bCounty;
        }

        public String getBState() {
            return bState;
        }

        public void setBState(String bState) {
            this.bState = bState;
        }

        public String getBCountry() {
            return bCountry;
        }

        public void setBCountry(String bCountry) {
            this.bCountry = bCountry;
        }

        public String getBZipcode() {
            return bZipcode;
        }

        public void setBZipcode(String bZipcode) {
            this.bZipcode = bZipcode;
        }

        public String getBPhone() {
            return bPhone;
        }

        public void setBPhone(String bPhone) {
            this.bPhone = bPhone;
        }

        public String getSFirstname() {
            return sFirstname;
        }

        public void setSFirstname(String sFirstname) {
            this.sFirstname = sFirstname;
        }

        public String getSLastname() {
            return sLastname;
        }

        public void setSLastname(String sLastname) {
            this.sLastname = sLastname;
        }

        public String getSAddress() {
            return sAddress;
        }

        public void setSAddress(String sAddress) {
            this.sAddress = sAddress;
        }

        public String getSAddress2() {
            return sAddress2;
        }

        public void setSAddress2(String sAddress2) {
            this.sAddress2 = sAddress2;
        }

        public String getSCity() {
            return sCity;
        }

        public void setSCity(String sCity) {
            this.sCity = sCity;
        }

        public String getSCounty() {
            return sCounty;
        }

        public void setSCounty(String sCounty) {
            this.sCounty = sCounty;
        }

        public String getSState() {
            return sState;
        }

        public void setSState(String sState) {
            this.sState = sState;
        }

        public String getSCountry() {
            return sCountry;
        }

        public void setSCountry(String sCountry) {
            this.sCountry = sCountry;
        }

        public String getSZipcode() {
            return sZipcode;
        }

        public void setSZipcode(String sZipcode) {
            this.sZipcode = sZipcode;
        }

        public String getSPhone() {
            return sPhone;
        }

        public void setSPhone(String sPhone) {
            this.sPhone = sPhone;
        }

        public String getSAddressType() {
            return sAddressType;
        }

        public void setSAddressType(String sAddressType) {
            this.sAddressType = sAddressType;
        }

        public String getProfileName() {
            return profileName;
        }

        public void setProfileName(String profileName) {
            this.profileName = profileName;
        }

        public Object getFields() {
            return fields;
        }

        public void setFields(Object fields) {
            this.fields = fields;
        }

        public String getBCountryDescr() {
            return bCountryDescr;
        }

        public void setBCountryDescr(String bCountryDescr) {
            this.bCountryDescr = bCountryDescr;
        }

        public String getSCountryDescr() {
            return sCountryDescr;
        }

        public void setSCountryDescr(String sCountryDescr) {
            this.sCountryDescr = sCountryDescr;
        }

    }

}








   /* public class _5 {

        @SerializedName("link_id")
        @Expose
        private String linkId;
        @SerializedName("usergroup_id")
        @Expose
        private String usergroupId;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;

        public String getLinkId() {
            return linkId;
        }

        public void setLinkId(String linkId) {
            this.linkId = linkId;
        }

        public String getUsergroupId() {
            return usergroupId;
        }

        public void setUsergroupId(String usergroupId) {
            this.usergroupId = usergroupId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

    }*/




