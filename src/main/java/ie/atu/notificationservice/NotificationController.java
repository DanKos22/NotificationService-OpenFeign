package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class NotificationController {

    @PostMapping("/confirm")
    public String notifyDetails(@RequestBody )
}
