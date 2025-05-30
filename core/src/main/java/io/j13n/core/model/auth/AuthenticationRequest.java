package io.j13n.core.model.auth;

import io.j13n.core.dto.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AuthenticationRequest {
    private String userName;
    private String password;
    private boolean rememberMe;

    public static AuthenticationRequest of(String userName, String password, boolean rememberMe) {
        return new AuthenticationRequest()
                .setUserName(userName)
                .setPassword(password)
                .setRememberMe(rememberMe);
    }

    public static AuthenticationRequest of(String userName, String password) {
        return of(userName, password, false);
    }

    public static AuthenticationRequest of(User user) {
        return of(user.getUserName(), user.getPassword());
    }
}
