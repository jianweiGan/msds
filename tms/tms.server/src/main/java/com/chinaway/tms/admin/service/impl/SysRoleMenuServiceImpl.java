package com.chinaway.tms.admin.service.impl;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.chinaway.tms.admin.dao.SysRoleMenuMapper;
import com.chinaway.tms.admin.model.SysRoleMenu;
import com.chinaway.tms.admin.service.SysRoleMenuService;
import com.chinaway.tms.core.AbstractService;
import com.chinaway.tms.core.BaseMapper;
import com.chinaway.tms.utils.page.PageBean;

@Service
public class SysRoleMenuServiceImpl extends AbstractService<SysRoleMenu, Integer> implements SysRoleMenuService {
	
	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;
	
	/**具体子类service的实现需要使用的mapper*/
	@Override
	@Autowired
	public void setBaseMapper(BaseMapper<SysRoleMenu, Integer> baseMapper) {
		super.setBaseMapper(baseMapper);
	}

	@Override
	public PageBean<SysRoleMenu> select2PageBean(Map<String, Object> map) {
		PageBean<SysRoleMenu> pageBean = new PageBean<>();
		pageBean.setPageNo(Integer.parseInt(map.get("pageNo").toString()));
		pageBean.setPageSize(Integer.parseInt(map.get("pageSize").toString()));
		//注意map要先设置pageBean,拦截器里面要获取其值
		map.put("pageBean", pageBean);
		map.put("needPage", true);//是否分页，默认是false不分页
		pageBean.setResult(sysRoleMenuMapper.selectAll4Page(map));
		return pageBean;
	}
	
	@Override
	@Transactional
	public int deleteById(String ids) {
		String[] idsStr = ids.split(",");
		if (idsStr.length > 0) {
			for (String id : idsStr) {
				sysRoleMenuMapper.deleteById(Integer.parseInt(id));
			}
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	@Transactional
	public int insertRoleMenu(String menuids, SysRoleMenu sysRoleMenu) {
		sysRoleMenuMapper.deleteById(sysRoleMenu.getRoleid());
		String[] menuidArr = String.valueOf(menuids).split(",");
		for (int i = 0; i < menuidArr.length; i++) {
			if (StringUtils.isNotEmpty((menuidArr[i]))) {
				sysRoleMenu.setMenuid(Integer.parseInt(menuidArr[i]));
				sysRoleMenuMapper.insert(sysRoleMenu);
			}
		}
		return 0;
	}
}
