package com.leimingtech.mapper;

import com.leimingtech.entity.ShopOrderGoods;
import com.leimingtech.entity.ShopOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopOrderGoodsMapper {
    int countByExample(ShopOrderGoodsExample example);

    int deleteByExample(ShopOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopOrderGoods record);

    int insertSelective(ShopOrderGoods record);

    List<ShopOrderGoods> selectByExample(ShopOrderGoodsExample example);

    ShopOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopOrderGoods record, @Param("example") ShopOrderGoodsExample example);

    int updateByExample(@Param("record") ShopOrderGoods record, @Param("example") ShopOrderGoodsExample example);

    int updateByPrimaryKeySelective(ShopOrderGoods record);

    int updateByPrimaryKey(ShopOrderGoods record);
}