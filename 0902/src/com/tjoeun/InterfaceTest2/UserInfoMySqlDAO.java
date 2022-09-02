package com.tjoeun.InterfaceTest2;

public class UserInfoMySqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoVO userInfoVO) {
		System.out.println("insert info MYSQL DB userid = " + userInfoVO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoVO userInfoVO) {
		System.out.println("update info MYSQL DB userid = " + userInfoVO.getUserId());

	}

	@Override
	public void deleteUserInfo(UserInfoVO userInfoVO) {
		System.out.println("delete info MYSQL DB userid = " + userInfoVO.getUserId());

	}

}
