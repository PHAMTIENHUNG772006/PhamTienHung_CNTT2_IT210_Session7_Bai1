package com.re.session7.controller;

import com.re.session7.model.RestaurantProfile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestauranController {

    @PostMapping("/merchant/update-profile")
    public String updateProfile(RestaurantProfile profile) {
        System.out.println("Tên quán: " + profile.getName());
        // Gọi service lưu vào DB...
        return "success";
    }
}
