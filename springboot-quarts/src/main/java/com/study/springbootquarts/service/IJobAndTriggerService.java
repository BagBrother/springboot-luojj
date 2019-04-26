package com.study.springbootquarts.service;


import com.github.pagehelper.PageInfo;
import com.study.springbootquarts.entity.JobAndTrigger;

public interface IJobAndTriggerService {
	 PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
