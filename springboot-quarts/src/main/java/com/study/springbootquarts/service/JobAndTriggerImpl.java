package com.study.springbootquarts.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.springbootquarts.entity.JobAndTrigger;
import com.study.springbootquarts.mapper.JobAndTriggerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class JobAndTriggerImpl implements IJobAndTriggerService{

	@Resource
	private JobAndTriggerMapper jobAndTriggerMapper;

	@Override
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
        return new PageInfo<>(list);
	}

}