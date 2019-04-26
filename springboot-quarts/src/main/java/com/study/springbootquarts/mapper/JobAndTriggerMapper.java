package com.study.springbootquarts.mapper;


import com.study.springbootquarts.entity.JobAndTrigger;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface JobAndTriggerMapper {
     List<JobAndTrigger> getJobAndTriggerDetails();
}
