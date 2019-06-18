package com.leimingtech.mapper;

import com.leimingtech.entity.ShopGoodsSpecs;
import com.leimingtech.entity.ShopGoodsSpecsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopGoodsSpecsMapper {
    int countByExample(ShopGoodsSpecsExample example);

    int deleteByExample(ShopGoodsSpecsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShopGoodsSpecs record);

    int insertSelective(ShopGoodsSpecs record);

    List<ShopGoodsSpecs> selectByExample(ShopGoodsSpecsExample example);

    ShopGoodsSpecs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShopGoodsSpecs record, @Param("example") ShopGoodsSpecsExample example);

    int updateByExample(@Param("record") ShopGoodsSpecs record, @Param("example") ShopGoodsSpecsExample example);

    int updateByPrimaryKeySelective(ShopGoodsSpecs record);

    int updateByPrimaryKey(ShopGoodsSpecs record);
}