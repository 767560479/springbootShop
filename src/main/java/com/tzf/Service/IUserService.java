/**
 *  @Title:  IUserService.java 
 *  @author: tzf
 *  @Description:    TODO(用一句话描述该文件做什么)
 *  @date:   2019年4月23日 下午9:19:51 
 *
 */
package com.tzf.Service;

import java.util.List;

import com.tzf.model.AuctionUser;

public  interface IUserService {
	List<AuctionUser> getUserAll ();
}
