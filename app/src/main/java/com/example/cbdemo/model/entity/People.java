package com.example.cbdemo.model.entity;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cbdemo.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import androidx.databinding.BindingAdapter;

public class People {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("favouriteColor")
    @Expose
    private String favouriteColor;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;


    /**
     *
     * @param id
     * @param lastName
     * @param favouriteColor
     * @param phone
     * @param email
     * @param createdAt
     * @param firstName
     * @param avatar
     * @param jobTitle
     */
    public People(String id, String createdAt, String avatar, String jobTitle, String phone, String favouriteColor, String email, String firstName, String lastName) {
        super();
        this.id = id;
        this.createdAt = createdAt;
        this.avatar = avatar;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.favouriteColor = favouriteColor;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // for loading image here
    @BindingAdapter({ "avatar" })
    public static void loadImage(ImageView imageView, String imageURL) {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(new RequestOptions()
                        .circleCrop())
                .load(imageURL)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
    }
}
