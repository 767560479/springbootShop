package com.tzf.dao;

import com.tzf.model.Auction;

public interface AuctionMapper {
    int deleteByPrimaryKey(Integer auctionid);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(Integer auctionid);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);
}