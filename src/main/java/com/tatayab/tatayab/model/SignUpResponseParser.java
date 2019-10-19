package com.tatayab.tatayab.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignUpResponseParser {

        @SerializedName("user_id")
        @Expose
        private Integer userId;
        @SerializedName("profile_id")
        @Expose
        private String profileId;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getProfileId() {
            return profileId;
        }

        public void setProfileId(String profileId) {
            this.profileId = profileId;
        }

    }

