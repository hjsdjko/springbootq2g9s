package com.dao;

import com.entity.TijianbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijianbaogaoVO;
import com.entity.view.TijianbaogaoView;


/**
 * 体检报告
 * 
 * @author 
 * @email 
 * @date 2021-05-19 23:25:04
 */
public interface TijianbaogaoDao extends BaseMapper<TijianbaogaoEntity> {
	
	List<TijianbaogaoVO> selectListVO(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
	
	TijianbaogaoVO selectVO(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
	
	List<TijianbaogaoView> selectListView(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);

	List<TijianbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
	
	TijianbaogaoView selectView(@Param("ew") Wrapper<TijianbaogaoEntity> wrapper);
	
}
