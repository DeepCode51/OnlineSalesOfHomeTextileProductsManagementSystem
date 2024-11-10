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


import com.dao.DiscussremenzhuanquDao;
import com.entity.DiscussremenzhuanquEntity;
import com.service.DiscussremenzhuanquService;
import com.entity.vo.DiscussremenzhuanquVO;
import com.entity.view.DiscussremenzhuanquView;

@Service("discussremenzhuanquService")
public class DiscussremenzhuanquServiceImpl extends ServiceImpl<DiscussremenzhuanquDao, DiscussremenzhuanquEntity> implements DiscussremenzhuanquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenzhuanquEntity> page = this.selectPage(
                new Query<DiscussremenzhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussremenzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenzhuanquEntity> wrapper) {
		  Page<DiscussremenzhuanquView> page =new Query<DiscussremenzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenzhuanquVO> selectListVO(Wrapper<DiscussremenzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenzhuanquVO selectVO(Wrapper<DiscussremenzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenzhuanquView> selectListView(Wrapper<DiscussremenzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenzhuanquView selectView(Wrapper<DiscussremenzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
