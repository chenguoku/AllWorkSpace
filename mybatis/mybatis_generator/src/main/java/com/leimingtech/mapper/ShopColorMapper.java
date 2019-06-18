package com.leimingtech.mapper;

import com.leimingtech.entity.ShopColor;
import com.leimingtech.entity.ShopColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopColorMapper {
    int countByExample(ShopColorExample example);

    int deleteByExample(ShopColorExample example);

    int insert(ShopColor record);

    int insertSelective(ShopColor record);

    List<ShopColor> selectByExample(ShopColorExample example);

    int updateByExampleSelective(@Param("record") ShopColor record, @Param("example") ShopColorExample example);

    int updateByExample(@Param("record") ShopColor record, @Param("example") ShopColorExample example);
}