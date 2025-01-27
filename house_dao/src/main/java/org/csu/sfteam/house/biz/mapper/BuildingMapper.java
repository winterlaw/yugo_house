package org.csu.sfteam.house.biz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.csu.sfteam.house.common.model.items.Building;
import org.csu.sfteam.house.common.model.items.Building_standard;
import org.csu.sfteam.house.common.model.items.Property;
import org.csu.sfteam.house.common.model.items.Rent;
import org.w3c.dom.ls.LSInput;

import java.util.List;

/**
 * @email 1694522669@qq.com
 * @author: A
 * @date: 2019/9/1 12:26
 */
@Mapper
public interface BuildingMapper {
    public int insertBuilding(Building_standard building_standard);

    public int insertProperty(Property property);

    public int insertRent(Rent rent);

    public int delete(Building_standard Building_standard);

    public int deleteByID(int id);

    public int updateBuilding(Building_standard building_standard);

    public int updateProperty(Property property);

    public int updateRent(Rent rent);

    public List<Building> getPropertyListByKeywords(String keywords);

    public List<Building> getRentListByKeywords(String keywords);

    public List<Building> getOldHouseListByKeywords(String keywords);

    public Building getPropertyByItemName(String itemName);

    public Building getRentByItemName(String itemName);

    public Building getOldHouseByItemName(String keywords);

    public List<Building> showProperty();

    public List<Building> showRent();

    public List<Building> showOldHouse();

    public List<Building> showRentByAddress(String address);

    public List<Building> showPropertyByAddress(String address);

    public List<Building> showOldHouseByAddress(String address);

    public List<Building> showRentByPrice(double priceMax, double priceMin);

    public List<Building> showOldHouseByPrice(double priceMax, double priceMin);

    public List<Building> showRentByArea(double areaMax, double areaMin);

    public List<Building> showOldHouseByArea(double areaMax, double areaMin);

    public List<Building> showRentByItemFrom(int ID);

    public List<Building> showPropertyByItemFrom(int ID);

    public List<Building> showOldHouseByItemFrom(int ID);
}
