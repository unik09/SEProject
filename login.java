import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class LoginApp {

    public static void main(String[] args) {
        SpringApplication.run(LoginApp.class, args);
    }
}

@RestController
@RequestMapping("/api")
class LoginController {

    // Example users (in-memory database for simplicity)
    private final Map<String, String> users = new HashMap<>();

    public LoginController() {
        users.put("testuser", "password123");
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        if (users.containsKey(username) && users.get(username).equals(password)) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        }

        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("message", "Invalid credentials");
        return ResponseEntity.status(401).body(errorResponse);
    }
}
