/**
 * 
 */
package com.mlx.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mlx.dao.UserDao;
import com.mlx.entity.CmlUser;
import com.mlx.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	public CmlUser getUserByUserNo( String userNo ) {
		return userDao.getUserByUserNo( userNo );
	}

	public int getInvitFriendNum( String userNo ) {
		int count = userDao.getInvitFriendNum( userNo );
		return count;
	}

	public CmlUser getUserInfoByUserNoWithDB( String userNo ) {
		CmlUser user = userDao.getUserByUserNo( userNo );
		return user;
	}

	/**
	 * 根据手机号修改用户信息
	 * 
	 * @param cmlUser
	 * @return
	 */
	public int updateByMobileSelective( CmlUser cmlUser ) {
		int result = userDao.updateByUserNoSelective( cmlUser );
		return result;
	}

	/**
	 * 根据手机号修改用户信息
	 * 
	 * @param cmlUser
	 * @return
	 */
	public int updateByMobile( CmlUser cmlUser ) {
		int result = userDao.updateByMobile( cmlUser );
		return result;
	}

	/**
	 * 根据邮箱查询用户
	 * 
	 * @param email
	 */
	public CmlUser verificationEmail( String email ) {
		return userDao.verificationEmail( email );
	}

	/**
	 * 根据手机号码查询用户
	 * 
	 * @param mobile
	 */
	public CmlUser verificationMobile( String mobile ) {
		return userDao.verificationMobile( mobile );
	}

	/**
	 * 根据手机号码查询用户
	 * 
	 * @param mobile
	 */
	public CmlUser selectCmlUserByMobile( String mobile ) {
		return userDao.selectCmlUserByMobile( mobile );
	}

	/**
	 * 激活状态
	 * 
	 * @param mobile
	 */
	public int updateStatusByEmail( CmlUser cmlUser ) {
		int result = userDao.updateStatusByEmail( cmlUser );
		return result;
	}

	/**
	 * 更新头像
	 * 
	 * @param mobile
	 */
	public int updateHeadImage( CmlUser cmlUser ) {
		int result = userDao.updateHeadImage( cmlUser );
		return result;
	}

	/**
	 * 更新头像
	 * 
	 * @param mobile
	 */
	public int updateFrontImageUrl( CmlUser cmlUser ) {
		int result = userDao.updateFrontImageUrl( cmlUser );
		return result;
	}

	/**
	 * 更新邮箱
	 * 
	 * @param mobile
	 */
	public int updateEmail( CmlUser cmlUser ) {
		int result = userDao.updateEmail( cmlUser );
		return result;
	}

	/**
	 * 更新手机
	 * 
	 * @param mobile
	 */
	public int updateMobile( CmlUser cmlUser ) {
		int result = userDao.updateMobile( cmlUser );
		return result;
	}

	public int updateAuthStatus( CmlUser cmlUser ) {
		Date date = new Date();
		cmlUser.setAuthTime( date );
		int result = userDao.updateAuthStatus( cmlUser );
		return result;
	}

	public int addCard( CmlUser cmlUser ) {
		Date date = new Date();
		cmlUser.setSubmitTime( date );
		cmlUser.setAuthStatus( 0 );
		int result = userDao.addCard( cmlUser );
		return result;
	}

	public List<CmlUser> getUserByUserNos( String[] strs ) {
		if( strs == null || strs.length <= 0 ) {
			return null;
		}
		List<CmlUser> lsCmlUser = new ArrayList<CmlUser>();
		List<String> ls = Arrays.asList( strs );
		for( String userNo : ls ) {
			CmlUser user = getUserByUserNo( userNo.trim() );
			if( user != null ) {
				lsCmlUser.add( user );
			}
		}
		return lsCmlUser;
	}

	/**
	 * 查找所有前端用户会员等级大于1的用户
	 * 
	 * @return
	 */
	public List<CmlUser> findByUserType() {
		return userDao.findByUserType();
	}

	public List<CmlUser> findMemberByFirstLogin() {
		return userDao.findMemberByFirstLogin();
	}
}
