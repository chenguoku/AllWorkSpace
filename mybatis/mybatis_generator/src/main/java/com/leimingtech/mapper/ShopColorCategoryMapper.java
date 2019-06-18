package com.leimingtech.mapper;

import com.leimingtech.entity.ShopColorCategory;
import com.leimingtech.entity.ShopColorCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopColorCategoryMapper {
    int countByExample(ShopColorCategoryExample example);

    int deleteByExample(ShopColorCategoryExample example);

    int insert(ShopColorCategory record);

    int insertSelective(ShopColorCategory record);

    List<ShopColorCategory> selectByExample(ShopColorCategoryExample example);

    int updateByExampleSelective(@Param("record") ShopColorCategory record, @Param("example") ShopColorCategoryExample example);

    int updateByExample(@Param("record") ShopColorCategory record, @Param("example") ShopColorCategoryExample example);
}