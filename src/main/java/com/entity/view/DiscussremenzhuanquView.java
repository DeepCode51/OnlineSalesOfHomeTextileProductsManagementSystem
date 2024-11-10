package com.entity.view;

import com.entity.DiscussremenzhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门专区评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-20 09:04:31
 */
@TableName("discussremenzhuanqu")
public class DiscussremenzhuanquView  extends DiscussremenzhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussremenzhuanquView(){
	}
 
 	public DiscussremenzhuanquView(DiscussremenzhuanquEntity discussremenzhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, discussremenzhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
