package com.bushlay.demo.service;

import com.bushlay.demo.entity.Plan;
import com.bushlay.demo.mapper.PlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService {
    @Autowired
    private PlanMapper planMapper;

    public List<Plan> getPlan() {
//        planMapper.getPlan();
        return planMapper.getPlan();
    }

    public Plan addPlan(Plan plan) {
        return planMapper.addPlan(plan);
    }

    public void deletePlan(String id) {
        planMapper.deletePlan(id);
    }

    public void updatePlan(Plan plan) {
        planMapper.updatePlan(plan);
    }

}
