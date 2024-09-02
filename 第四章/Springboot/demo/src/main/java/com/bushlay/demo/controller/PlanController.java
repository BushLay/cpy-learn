package com.bushlay.demo.controller;

import com.bushlay.demo.entity.Plan;
import com.bushlay.demo.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/plans")
public class PlanController {
    @Autowired
    private PlanService planService;

    @GetMapping
    public List<Plan> getPlan() {
        return planService.getPlan();
    }

    @PostMapping
    public Plan addPlan(@RequestBody Plan plan) {
        return planService.addPlan(plan);
    }
    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable String id) {
        planService.deletePlan(id);
    }
    @PutMapping("/{id}")
    public void updatePlan(@PathVariable String id, @RequestBody Plan plan) {
        planService.updatePlan(plan);
    }

}
