package model.usersettings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProfileSettings {
    private int userType;
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private String createdAt;
    private String updatedAt;
}
