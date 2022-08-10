package model.usersettings;

public class ProfileSettings {
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private String createdAt;
    private String updatedAt;

    public ProfileSettings(int userStatus, String profilePicture, String coverPicture, String createdAt, String updatedAt) {
        this.userStatus = userStatus;
        this.profilePicture = profilePicture;
        this.coverPicture = coverPicture;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
