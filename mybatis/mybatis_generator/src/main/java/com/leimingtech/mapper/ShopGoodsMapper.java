package com.leimingtech.mapper;

import com.leimingtech.entity.ShopGoods;
import com.leimingtech.entity.ShopGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsMapper {
    int countByExample(ShopGoodsExample example);

    int deleteByExample(ShopGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoods record);

    int insertSelective(ShopGoods record);

    List<ShopGoods> selectByExample(ShopGoodsExample example);

    ShopGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByExample(@Param("record") ShopGoods record, @Param("example") ShopGoodsExample example);

    int updateByPrimaryKeySelective(ShopGoods record);

    int updateByPrimaryKey(ShopGoods record);
}