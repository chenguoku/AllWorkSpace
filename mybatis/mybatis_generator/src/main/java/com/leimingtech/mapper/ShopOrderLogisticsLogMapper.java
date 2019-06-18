package com.leimingtech.mapper;

import com.leimingtech.entity.ShopOrderLogisticsLog;
import com.leimingtech.entity.ShopOrderLogisticsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopOrderLogisticsLogMapper {
    int countByExample(ShopOrderLogisticsLogExample example);

    int deleteByExample(ShopOrderLogisticsLogExample example);

    int insert(ShopOrderLogisticsLog record);

    int insertSelective(ShopOrderLogisticsLog record);

    List<ShopOrderLogisticsLog> selectByExample(ShopOrderLogisticsLogExample example);

    int updateByExampleSelective(@Param("record") ShopOrderLogisticsLog record, @Param("example") ShopOrderLogisticsLogExample example);

    int updateByExample(@Param("record") ShopOrderLogisticsLog record, @Param("example") ShopOrderLogisticsLogExample example);
}