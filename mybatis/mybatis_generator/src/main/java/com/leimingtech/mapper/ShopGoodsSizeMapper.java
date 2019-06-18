package com.leimingtech.mapper;

import com.leimingtech.entity.ShopGoodsSize;
import com.leimingtech.entity.ShopGoodsSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsSizeMapper {
    int countByExample(ShopGoodsSizeExample example);

    int deleteByExample(ShopGoodsSizeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopGoodsSize record);

    int insertSelective(ShopGoodsSize record);

    List<ShopGoodsSize> selectByExample(ShopGoodsSizeExample example);

    ShopGoodsSize selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopGoodsSize record, @Param("example") ShopGoodsSizeExample example);

    int updateByExample(@Param("record") ShopGoodsSize record, @Param("example") ShopGoodsSizeExample example);

    int updateByPrimaryKeySelective(ShopGoodsSize record);

    int updateByPrimaryKey(ShopGoodsSize record);
}