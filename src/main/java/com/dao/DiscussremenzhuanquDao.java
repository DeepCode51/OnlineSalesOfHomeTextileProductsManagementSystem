package com.dao;

import com.entity.DiscussremenzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenzhuanquVO;
import com.entity.view.DiscussremenzhuanquView;


/**
 * 热门专区评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-20 09:04:31
 */
public interface DiscussremenzhuanquDao extends BaseMapper<DiscussremenzhuanquEntity> {
	
	List<DiscussremenzhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
	
	DiscussremenzhuanquVO selectVO(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
	
	List<DiscussremenzhuanquView> selectListView(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);

	List<DiscussremenzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
	
	DiscussremenzhuanquView selectView(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
	

}
