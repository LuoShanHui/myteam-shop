package com.qf.shop.index.service.service;

import com.qf.entity.TProduct;
import com.qf.entity.TProductType;

import java.util.List;

/**
 * @Author Administrator
 * @PACKAGE myteam-shop
 */
public interface IndexService {
    List<TProductType> selectAllProductType();

    List<TProduct> selectAllProduct();
}
