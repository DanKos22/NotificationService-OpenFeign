package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/register")
    public String notifyDetails(@RequestBody UserDetails user){
        String notificationMessage = String.format("User %s (%s) has been successfully registered.", user.getName(), user.getEmail());
        return notificationMessage;
    }
}
