package com.tzf.dao;

import java.util.List;

import com.tzf.model.AuctionUser;

public interface AuctionUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(AuctionUser record);

    int insertSelective(AuctionUser record);

    AuctionUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(AuctionUser record);

    int updateByPrimaryKey(AuctionUser record);
    
    List selectUserAll();
}