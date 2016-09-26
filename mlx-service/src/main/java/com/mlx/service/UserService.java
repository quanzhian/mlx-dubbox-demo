/**
 * 
 */
package com.mlx.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.mlx.entity.CmlUser;

/**
 * @author Tocky
 *注意：类上的path表示是从根目录开始，增加这个路径的，如，下面public的访问路径为http://localhost:2080/user
 */
@Path("user")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public interface UserService {
	
//	@GET
//	@Path("getUser/{userID}")
//	CmlUser getUser(@PathParam("userID") String userID);
//	
//	@GET
//	@Path("getUserByNativePlace/{nativePlace}")
//	List<CmlUser> getUserByNativePlace(@PathParam("nativePlace") String nativePlace);
	
	@GET
	@Path("getUserByUserNo/{userNo}")
	public CmlUser getUserByUserNo(@PathParam("userNo") String userNo );
	
	@GET
	@Path("getInvitFriendNum/{userNo}")
	public int getInvitFriendNum(@PathParam("userNo") String userNo ) ;
	
	@GET
	@Path("getUserInfoByUserNoWithDB/{userNo}")
	public CmlUser getUserInfoByUserNoWithDB(@PathParam("userNo") String userNo );

	/**
	 * 根据邮箱查询用户
	 * 
	 * @param email
	 */
	@GET
	@Path("verificationEmail/{email}")
	public CmlUser verificationEmail(@PathParam("email")  String email );

	/**
	 * 根据手机号码查询用户
	 * 
	 * @param mobile
	 */
	@GET
	@Path("verificationMobile/{mobile}")
	public CmlUser verificationMobile(@PathParam("mobile") String mobile );

	/**
	 * 根据手机号码查询用户
	 * 
	 * @param mobile
	 */
	@GET
	@Path("selectCmlUserByMobile/{mobile}")
	public CmlUser selectCmlUserByMobile(@PathParam("mobile") String mobile );

	/**
	 * 查找所有前端用户会员等级大于1的用户
	 * 
	 * @return
	 */
	@GET
	@Path("findByUserType")
	public List<CmlUser> findByUserType() ;

	@GET
	@Path("findMemberByFirstLogin")
	public List<CmlUser> findMemberByFirstLogin();

}
