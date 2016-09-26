/**
 * 
 */
package com.mlx.dao;

import java.util.List;
import java.util.Map;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.mlx.entity.CmlUser;

/**
 * @author Tocky
 *
 */
public interface UserDao {
	
	int insert( CmlUser record );

	int insertSelective( CmlUser record );

	int updateByUserNo( CmlUser record );

	int updateByMobile( CmlUser record );

	int updateByUserNoSelective( CmlUser record );

	List<CmlUser> search( Map<String, Object> parameters );

	int register( CmlUser user );

	int updateStatusByEmail( CmlUser record );

	int updateHeadImage( CmlUser cmlUser );

	int updateFrontImageUrl( CmlUser cmlUser );

	int updateEmail( CmlUser cmlUser );

	int updateMobile( CmlUser cmlUser );

	int updatePassword( CmlUser record );

	List<CmlUser> selectByPage( CmlUser cmlUser, PageBounds pagebounds );

	CmlUser verificationEmail( String email );

	CmlUser verificationMobile( String mobile );

	CmlUser selectCmlUserByMobile( String mobile );

	CmlUser findStutusByEmail( Map<String, Object> map );

	List<CmlUser> findAllCard( PageBounds pagebounds );

	int updateAuthStatus( CmlUser record );

	int addCard( CmlUser record );

	CmlUser getUserByUserNo( String userNo );

	int updateMebTypeByUser( CmlUser cmlUser );

	List<CmlUser> findByUserType();

	List<CmlUser> findByUserType( PageBounds pagebounds );

	int getInvitFriendNum( String userNo );

	List<CmlUser> getInvitFriendList( Map<String, Object> paramMap, PageBounds pagebounds );

	List<CmlUser> getInvitFriendList( Map<String, Object> paramMap );

	List<CmlUser> findByCondition( Map<String, Object> paramMap, PageBounds pageBounds );

	CmlUser selectByUserNo( String id );

	int updateFirstLoginFlag( CmlUser cmlUser );

	List<CmlUser> findMemberByFirstLogin();

	PageList<CmlUser> selectByPageForSendEmailMutil( CmlUser cmlUser, PageBounds pageBounds );


}
