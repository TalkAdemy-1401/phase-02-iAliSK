package user.info;

public class PrivateInfo {
    private int id;
    private String name;
    private int gender;
    private String dob;
    private String about;
    private String email;
    private String password;

    public PrivateInfo(int id, String name, int gender, String dob, String about, String email, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.about = about;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
