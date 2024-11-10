package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RemenzhuanquDao;
import com.entity.RemenzhuanquEntity;
import com.service.RemenzhuanquService;
import com.entity.vo.RemenzhuanquVO;
import com.entity.view.RemenzhuanquView;

@Service("remenzhuanquService")
public class RemenzhuanquServiceImpl extends ServiceImpl<RemenzhuanquDao, RemenzhuanquEntity> implements RemenzhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenzhuanquEntity> page = this.selectPage(
                new Query<RemenzhuanquEntity>(params).getPage(),
                new EntityWrapper<RemenzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenzhuanquEntity> wrapper) {
		  Page<RemenzhuanquView> page =new Query<RemenzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenzhuanquVO> selectListVO(Wrapper<RemenzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenzhuanquVO selectVO(Wrapper<RemenzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenzhuanquView> selectListView(Wrapper<RemenzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenzhuanquView selectView(Wrapper<RemenzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
