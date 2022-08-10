package controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import model.Employee;
import model.userinfo.LocationInfo;
import model.userinfo.PaymentInfo;
import model.userinfo.PrivateInfo;
import model.usersettings.AccountSettings;
import model.usersettings.ProfileSettings;

import java.io.IOException;

public class EmployeeDeserializer extends StdDeserializer<Employee> {

    public EmployeeDeserializer() {
        this(null);
    }

    public EmployeeDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Employee deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);

        int id = node.get("id").asInt();
        String name = node.get("name").asText();
        String email = node.get("email").asText();
        String password = node.get("password").asText();
        String about = node.get("about").asText();
        String token = node.get("token").asText();
        String country = node.get("country").asText();
        String location = node.get("location").asText();
        int lng = node.get("lng").asInt();
        int lat = node.get("lat").asInt();
        String dob = node.get("dob").asText();
        int gender = node.get("gender").asInt();
        int userType = node.get("userType").asInt();
        int userStatus = node.get("userStatus").asInt();
        String profilePicture = node.get("profilePicture").asText();
        String coverPicture = node.get("coverPicture").asText();
        boolean enablefollowme = node.get("enablefollowme").asBoolean();
        boolean sendmenotifications = node.get("sendmenotifications").asBoolean();
        boolean sendTextmessages = node.get("sendTextmessages").asBoolean();
        boolean enabletagging = node.get("enabletagging").asBoolean();
        String createdAt = node.get("createdAt").asText();
        String updatedAt = node.get("updatedAt").asText();
        double livelng = node.get("livelng").asDouble();
        double livelat = node.get("livelat").asDouble();
        String liveLocation = node.get("liveLocation").asText();
        int creditBalance = node.get("creditBalance").asInt();
        int myCash = node.get("myCash").asInt();

        PrivateInfo privateInfo = new PrivateInfo(id, name, gender, dob, about, email, password);
        LocationInfo locationInfo = new LocationInfo(country, location, lng, lat, livelng, livelat, liveLocation);
        PaymentInfo paymentInfo = new PaymentInfo(creditBalance, myCash);

        AccountSettings accountSettings = new AccountSettings(enablefollowme,
                sendmenotifications, sendTextmessages, enabletagging);

        ProfileSettings profileSettings = new ProfileSettings(userStatus,
                profilePicture, coverPicture, createdAt, updatedAt);

        return new Employee(token, userType, privateInfo, locationInfo, paymentInfo, profileSettings, accountSettings);
    }
}