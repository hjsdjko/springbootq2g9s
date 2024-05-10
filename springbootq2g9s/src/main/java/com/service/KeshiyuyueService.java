package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeshiyuyueView;


/**
 * 科室预约
 *
 * @author 
 * @email 
 * @date 2021-05-19 23:25:04
 */
public interface KeshiyuyueService extends IService<KeshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeshiyuyueVO> selectListVO(Wrapper<KeshiyuyueEntity> wrapper);
   	
   	KeshiyuyueVO selectVO(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
   	
   	List<KeshiyuyueView> selectListView(Wrapper<KeshiyuyueEntity> wrapper);
   	
   	KeshiyuyueView selectView(@Param("ew") Wrapper<KeshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeshiyuyueEntity> wrapper);
   	
}

