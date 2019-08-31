package com.yc.shoesMall.dao;

import com.yc.shoesMall.bean.ProductBrand;
import com.yc.shoesMall.bean.ProductBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    long countByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int deleteByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int insert(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int insertSelective(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    List<ProductBrand> selectByExample(ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    ProductBrand selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductBrand record, @Param("example") ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByExample(@Param("record") ProductBrand record, @Param("example") ProductBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByPrimaryKeySelective(ProductBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_brand
     *
     * @mbg.generated Mon Aug 26 14:20:54 CST 2019
     */
    int updateByPrimaryKey(ProductBrand record);
}