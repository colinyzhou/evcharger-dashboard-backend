package com.evcharger.dashboard.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.evcharger.dashboard.entity.Station;
import com.evcharger.dashboard.entity.dto.StationDetailDTO;
import com.evcharger.dashboard.entity.dto.StationSiteDTO;
import com.evcharger.dashboard.entity.dto.StationUsageDTO;

import java.util.List;

public interface StationService extends IService<Station> {

    IPage<StationSiteDTO> getStationsWithSite(Page<?> page);

//    IPage<StationSiteDTO> getStationsWithFilters(Page<?> page, String stationName, String city, String postcode, Boolean supportsFastCharging);

//    StationDetailDTO getStationDetails(String stationName);
    IPage<StationSiteDTO> getStationsWithFilters(Page<?> page, String stationName, String city, String postcode, Boolean supportsFastCharging);

    StationDetailDTO getStationDetails(String stationName);

    List<StationUsageDTO> getStationsUsageWithLocation();
}
