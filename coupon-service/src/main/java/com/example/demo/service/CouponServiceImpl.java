package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.CouponDao;
import com.example.demo.model.Coupon;
@Service
@EnableTransactionManagement
public class CouponServiceImpl implements CouponService{
	
	private CouponDao couponDao;
	
	@Autowired
	
	public CouponServiceImpl(CouponDao couponDao) {
		this.couponDao = couponDao;
	}

	@Override
	@Transactional
	public Coupon createCoupon(Coupon coupon) {
		
		return couponDao.save(coupon);
	}

	@Override
	@Transactional
	public Coupon getCouponByCode(String couponCode) {
		
		return couponDao.findByCouponCode(couponCode);
	}

}
