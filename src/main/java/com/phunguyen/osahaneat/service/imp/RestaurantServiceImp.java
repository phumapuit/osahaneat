package com.phunguyen.osahaneat.service.imp;

import com.phunguyen.osahaneat.dto.RestaurantDTO;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface RestaurantServiceImp {
    boolean insertRestaurant( MultipartFile file, String title, String subtitle, String description, boolean isFreeship, String address, String openDate);
    List<RestaurantDTO> getHomePageRestaurant();
}
