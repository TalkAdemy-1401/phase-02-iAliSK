package user.settings;

public class AccountSettings {
    private boolean enablefollowme;
    private boolean sendmenotifications;
    private boolean sendTextmessages;
    private boolean enabletagging;

    public AccountSettings(boolean enablefollowme, boolean sendmenotifications, boolean sendTextmessages, boolean enabletagging) {
        this.enablefollowme = enablefollowme;
        this.sendmenotifications = sendmenotifications;
        this.sendTextmessages = sendTextmessages;
        this.enabletagging = enabletagging;
    }

    public boolean isEnablefollowme() {
        return enablefollowme;
    }

    public void setEnablefollowme(boolean enablefollowme) {
        this.enablefollowme = enablefollowme;
    }

    public boolean isSendmenotifications() {
        return sendmenotifications;
    }

    public void setSendmenotifications(boolean sendmenotifications) {
        this.sendmenotifications = sendmenotifications;
    }

    public boolean isSendTextmessages() {
        return sendTextmessages;
    }

    public void setSendTextmessages(boolean sendTextmessages) {
        this.sendTextmessages = sendTextmessages;
    }

    public boolean isEnabletagging() {
        return enabletagging;
    }

    public void setEnabletagging(boolean enabletagging) {
        this.enabletagging = enabletagging;
    }
}
