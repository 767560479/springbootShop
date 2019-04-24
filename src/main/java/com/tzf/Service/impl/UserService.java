/**
 *  @Title:  UserService.java 
 *  @author: tzf
 *  @Description:    TODO(用一句话描述该文件做什么)
 *  @date:   2019年4月23日 下午9:42:49 
 *
 */
package com.tzf.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tzf.Service.IUserService;
import com.tzf.dao.AuctionUserMapper;
import com.tzf.model.AuctionUser;


/**
*@author tzf
*@version 创建时间：2019年4月23日下午9:42:49
*/
@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
    AuctionUserMapper auctionUserMapper;

	@Override
	public List<AuctionUser> getUserAll() {
      return auctionUserMapper.selectUserAll();
	}

}
