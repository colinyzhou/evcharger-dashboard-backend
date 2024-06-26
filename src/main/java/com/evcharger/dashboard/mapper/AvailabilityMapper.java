package com.evcharger.dashboard.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.evcharger.dashboard.entity.Availability;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AvailabilityMapper extends BaseMapper<Availability> {

    @Select("SELECT * FROM availability WHERE station_name = #{stationName} AND date = #{date}")
    List<Availability> getAvailabilityByStationAndDate(@Param("stationName") String stationName, @Param("date") String date);

    @Select("SELECT * FROM availability WHERE station_name = #{stationName} AND date >= (SELECT MAX(date) - INTERVAL #{scope} DAY FROM availability) ORDER BY date, hour")
    List<Availability> getAvailabilityByStationAndScope(@Param("stationName") String stationName, @Param("scope") int scope);

    @Select("SELECT * FROM availability WHERE station_name = #{stationName}")
    List<Availability> getAvailabilityByStationName(@Param("stationName") String stationName);

    @Select("SELECT DISTINCT city_id FROM availability WHERE station_name = #{stationName}")
    Integer getCityIdByStationName(@Param("stationName") String stationName);

    @Select("SELECT * FROM availability WHERE city_id = #{cityId}")
    List<Availability> getAvailabilityByCityId(@Param("cityId") Integer cityId);

    @Select("SELECT city_name FROM city WHERE city_id = #{cityId}")
    String getCityNameByCityId(@Param("cityId") Integer cityId);


}
