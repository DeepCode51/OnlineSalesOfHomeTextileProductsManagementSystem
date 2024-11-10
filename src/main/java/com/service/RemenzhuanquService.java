package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenzhuanquView;


/**
 * 热门专区
 *
 * @author 
 * @email 
 * @date 2022-03-20 09:04:30
 */
public interface RemenzhuanquService extends IService<RemenzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenzhuanquVO> selectListVO(Wrapper<RemenzhuanquEntity> wrapper);
   	
   	RemenzhuanquVO selectVO(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
   	
   	List<RemenzhuanquView> selectListView(Wrapper<RemenzhuanquEntity> wrapper);
   	
   	RemenzhuanquView selectView(@Param("ew") Wrapper<RemenzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenzhuanquEntity> wrapper);
   	

}

