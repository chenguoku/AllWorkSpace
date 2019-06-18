package com.leimingtech.mapper;

import com.leimingtech.entity.ShopCategoryJp;
import com.leimingtech.entity.ShopCategoryJpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCategoryJpMapper {
    int countByExample(ShopCategoryJpExample example);

    int deleteByExample(ShopCategoryJpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCategoryJp record);

    int insertSelective(ShopCategoryJp record);

    List<ShopCategoryJp> selectByExample(ShopCategoryJpExample example);

    ShopCategoryJp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCategoryJp record, @Param("example") ShopCategoryJpExample example);

    int updateByExample(@Param("record") ShopCategoryJp record, @Param("example") ShopCategoryJpExample example);

    int updateByPrimaryKeySelective(ShopCategoryJp record);

    int updateByPrimaryKey(ShopCategoryJp record);
}