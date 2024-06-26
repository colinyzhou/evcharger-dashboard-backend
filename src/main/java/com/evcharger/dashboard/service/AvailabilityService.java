package com.evcharger.dashboard.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evcharger.dashboard.entity.Availability;
import com.evcharger.dashboard.entity.dto.*;

import java.util.List;

public interface AvailabilityService extends IService<Availability> {
    List<Availability> getAvailabilityByStationAndDate(String stationName, String date);

    //时间点、可用性图
    List<ConnectorUsageResponseDTO> getConnectorUsageByStationAndScope(String stationName, int scope);
    //时间点、可用性图
    List<ConnectorUsageResponseDTO> getConnectorUsageByTimePeriod(String stationName, int scope);

    //星期几、可用性图
    List<ConnectorWeeklyUsageResponseDTO> getWeeklyUsageByStationAndConnector(String stationName);

    CityUsageResponseDTO getWeeklyUsageByCity(String stationName);


    List<ConnectorWeeklyHourlyUsageDTO> getWeeklyHourlyUsageByStationAndConnector(String stationName);

}
