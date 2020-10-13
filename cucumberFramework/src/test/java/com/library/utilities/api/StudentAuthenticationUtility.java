package com.library.utilities.api;


import com.library.utilities.common.Encoder;
import io.restassured.response.Response;
import sun.tools.java.Environment;

import static io.restassured.RestAssured.given;

public class StudentAuthenticationUtility implements AuthenticationUtility {
    private static Response response;
    private String token;
    private String redirectUrl;

    @Override
    public Response getLoginResponse() {
        if (response == null) {
            String username = "student_email";
            String password = "student_password";
            password = Encoder.decrypt(password);
            response = given().
                    formParam("email", username).
                    formParam("password", password).
                    log().all().
                    when().
                    post(Endpoints.LOGIN).prettyPeek();
            response.then().statusCode(200);
        }
        return response;
    }

    @Override
    public String getToken() {
        if (token == null) {
            token = response.jsonPath().getString("token");
        }
        return token;
    }

    @Override
    public String getRedirectUrl() {
        if (redirectUrl == null) {
            redirectUrl = response.jsonPath().getString("redirect_uri");
        }
        return redirectUrl;
    }
}