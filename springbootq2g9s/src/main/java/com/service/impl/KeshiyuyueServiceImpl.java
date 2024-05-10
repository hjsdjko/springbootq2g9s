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


import com.dao.KeshiyuyueDao;
import com.entity.KeshiyuyueEntity;
import com.service.KeshiyuyueService;
import com.entity.vo.KeshiyuyueVO;
import com.entity.view.KeshiyuyueView;

@Service("keshiyuyueService")
public class KeshiyuyueServiceImpl extends ServiceImpl<KeshiyuyueDao, KeshiyuyueEntity> implements KeshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeshiyuyueEntity> page = this.selectPage(
                new Query<KeshiyuyueEntity>(params).getPage(),
                new EntityWrapper<KeshiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeshiyuyueEntity> wrapper) {
		  Page<KeshiyuyueView> page =new Query<KeshiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeshiyuyueVO> selectListVO(Wrapper<KeshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeshiyuyueVO selectVO(Wrapper<KeshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeshiyuyueView> selectListView(Wrapper<KeshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeshiyuyueView selectView(Wrapper<KeshiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
