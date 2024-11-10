package com.dao;

import com.entity.RemenzhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenzhuanquVO;
import com.entity.view.RemenzhuanquView;


/**
 * 热门专区
 * 
 * @author 
 * @email 
 * @date 2022-03-20 09:04:30
 */
public interface RemenzhuanquDao extends BaseMapper<RemenzhuanquEntity> {
	
	List<RemenzhuanquVO> selectListVO(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
	
	RemenzhuanquVO selectVO(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
	
	List<RemenzhuanquView> selectListView(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);

	List<RemenzhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
	
	RemenzhuanquView selectView(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
	

}
