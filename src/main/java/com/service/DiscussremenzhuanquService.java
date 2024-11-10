package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenzhuanquView;


/**
 * 热门专区评论表
 *
 * @author 
 * @email 
 * @date 2022-03-20 09:04:31
 */
public interface DiscussremenzhuanquService extends IService<DiscussremenzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenzhuanquVO> selectListVO(Wrapper<DiscussremenzhuanquEntity> wrapper);
   	
   	DiscussremenzhuanquVO selectVO(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
   	
   	List<DiscussremenzhuanquView> selectListView(Wrapper<DiscussremenzhuanquEntity> wrapper);
   	
   	DiscussremenzhuanquView selectView(@Param("ew") Wrapper<DiscussremenzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenzhuanquEntity> wrapper);
   	

}

