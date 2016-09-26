package com.mlx.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CmlUser implements Serializable {
	
	private static final long serialVersionUID = 6606525175551984328L;
	
	public static final int USER_STATUS_DISABLED = 0;

	public static final int USER_STATUS_OK = 1;

	private Integer id;

	/**
	 * 登录帐号
	 */
	private String loginName;

	/**
	 * 用户编号，唯一
	 */
	private String userNo;
	
	/**
	 * 微信用户openid
	 */
	private String openId;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 密码
	 */
	private String password;

	private String email;

	/**
	 * 盐
	 */
	private String salt;

	/**
	 * 帐户开通时间
	 */
	private Date registerDate;

	/**
	 * 状态：0，未激活, 1，已激活 , 2，暂停
	 */
	private Integer status;

	private String mobile;

	/**
	 * 不作为数据库字段
	 */
	private String plainPassword;

	/**
	 * 用户类型 0表示是前端用户,1表示后端用户
	 */
	private Integer userType;

	private String headImageUrl;

	private Integer sex;

	private String frontImageUrl;

	private String residence;

	private String spaceSignature;

	private String levelName;

	private String spaceLevel;

	private String spaceName;

	private String remark;

	private Integer scoreNum;

	private Integer cardType;

	private String cardNo;

	private String cardImgPath;

	private Date submitTime;

	private Date authTime;

	private Integer authStatus;

	private Date birthday;

	private Integer constellation;

	private Integer bloodType;

	private Integer emotionState;

	private String occupation;

	private String companyName;

	private String companyAddress;

	private String companyDetailAddress;

	private String homeTown;

	private String bloodTypeName;

	private String emotionStateName;

	private String constellationName;

	private String validCode;

	private Integer infoStatus;

	private Integer firstLogin;

	private String invitUserNo;

	private Integer mebType;

	private Date levelTime;

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName( String loginName ) {
		this.loginName = loginName;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo( String userNo ) {
		this.userNo = userNo;
	}

	public String getName() {
		return name == null ? null : name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}

	public String getEmail() {
		return email == null ? null : email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt( String salt ) {
		this.salt = salt;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate( Date registerDate ) {
		this.registerDate = registerDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus( Integer status ) {
		this.status = status;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile( String mobile ) {
		this.mobile = mobile;
	}

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword( String plainPassword ) {
		this.plainPassword = plainPassword;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType( Integer userType ) {
		this.userType = userType;
	}

	public String getHeadImageUrl() {
		return headImageUrl;
	}

	public void setHeadImageUrl( String headImageUrl ) {
		this.headImageUrl = headImageUrl;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex( Integer sex ) {
		this.sex = sex;
	}

	public String getFrontImageUrl() {
		return frontImageUrl;
	}

	public void setFrontImageUrl( String frontImageUrl ) {
		this.frontImageUrl = frontImageUrl;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence( String residence ) {
		this.residence = residence == null ? null : residence.trim();
	}

	public String getSpaceSignature() {
		return spaceSignature;
	}

	public void setSpaceSignature( String spaceSignature ) {
		this.spaceSignature = spaceSignature == null ? null : spaceSignature.trim();
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName( String levelName ) {
		this.levelName = levelName == null ? null : levelName.trim();
	}

	public String getSpaceLevel() {
		return spaceLevel;
	}

	public void setSpaceLevel( String spaceLevel ) {
		this.spaceLevel = spaceLevel == null ? null : spaceLevel.trim();
	}

	public String getSpaceName() {
		return spaceName;
	}

	public void setSpaceName( String spaceName ) {
		this.spaceName = spaceName == null ? null : spaceName.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark( String remark ) {
		this.remark = remark;
	}

	public Integer getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum( Integer scoreNum ) {
		this.scoreNum = scoreNum;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType( Integer cardType ) {
		this.cardType = cardType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo( String cardNo ) {
		this.cardNo = cardNo;
	}

	public String getCardImgPath() {
		return cardImgPath;
	}

	public void setCardImgPath( String cardImgPath ) {
		this.cardImgPath = cardImgPath;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime( Date submitTime ) {
		this.submitTime = submitTime;
	}

	public Date getAuthTime() {
		return authTime;
	}

	public void setAuthTime( Date authTime ) {
		this.authTime = authTime;
	}

	public Integer getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus( Integer authStatus ) {
		this.authStatus = authStatus;
	}

	/**
	 * 给{@link #userNo}赋 {@link UUID}值
	 * 
	 */
	public void autoGenerateUserNo() {
		this.userNo = UUID.randomUUID().toString().replace( "-", "" );
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday( Date birthday ) {
		this.birthday = birthday;
	}

	public Integer getConstellation() {
		return constellation;
	}

	public void setConstellation( Integer constellation ) {
		this.constellation = constellation;
	}

	public Integer getBloodType() {
		return bloodType;
	}

	public void setBloodType( Integer bloodType ) {
		this.bloodType = bloodType;
	}

	public Integer getEmotionState() {
		return emotionState;
	}

	public void setEmotionState( Integer emotionState ) {
		this.emotionState = emotionState;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation( String occupation ) {
		this.occupation = occupation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName( String companyName ) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress( String companyAddress ) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyDetailAddress() {
		return companyDetailAddress;
	}

	public void setCompanyDetailAddress( String companyDetailAddress ) {
		this.companyDetailAddress = companyDetailAddress;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown( String homeTown ) {
		this.homeTown = homeTown;
	}

	public String getBloodTypeName() {
		return bloodTypeName;
	}

	public String getEmotionStateName() {
		return emotionStateName;
	}

	public String getConstellationName() {
		return constellationName;
	}

	public String getValidCode() {
		return validCode;
	}

	public void setValidCode( String validCode ) {
		this.validCode = validCode;
	}

	public Integer getMebType() {
		return mebType;
	}

	public void setMebType( Integer mebType ) {
		this.mebType = mebType;
	}

	public Date getLevelTime() {
		return levelTime;
	}

	public void setLevelTime( Date levelTime ) {
		this.levelTime = levelTime;
	}

	public Integer getInfoStatus() {
		return infoStatus == null ? 0 : infoStatus;
	}

	public void setInfoStatus( Integer infoStatus ) {
		this.infoStatus = infoStatus;
	}

	public Integer getFirstLogin() {
		return firstLogin == null ? 0 : firstLogin;
	}

	public void setFirstLogin( Integer firstLogin ) {
		this.firstLogin = firstLogin;
	}

	public String getInvitUserNo() {
		return invitUserNo;
	}

	public void setInvitUserNo( String invitUserNo ) {
		this.invitUserNo = invitUserNo;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId( String openId ) {
		this.openId = openId;
	}
	
}
