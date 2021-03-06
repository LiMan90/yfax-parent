package com.yfax.webapi.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yfax.webapi.cfdb.vo.TaskDetailVo;
import com.yfax.webapi.dao.TaskDetailDao;

@Component
public class TaskDetailDaoImpl implements TaskDetailDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public TaskDetailVo selectTaskDetailByTaskId(String taskId) {
		return this.sqlSessionTemplate.selectOne("selectTaskDetailByTaskId", taskId);
	}
}
