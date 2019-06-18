package com.leimingtech.mapper;

import com.leimingtech.entity.ShopLabel;
import com.leimingtech.entity.ShopLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopLabelMapper {
    int countByExample(ShopLabelExample example);

    int deleteByExample(ShopLabelExample example);

    int insert(ShopLabel record);

    int insertSelective(ShopLabel record);

    List<ShopLabel> selectByExample(ShopLabelExample example);

    int updateByExampleSelective(@Param("record") ShopLabel record, @Param("example") ShopLabelExample example);

    int updateByExample(@Param("record") ShopLabel record, @Param("example") ShopLabelExample example);
}