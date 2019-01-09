package com.bigbigmall.experiment.controller;

import com.bigbigmall.experiment.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.json.JSONArray;
import org.json.JSONObject;
import com.bigbigmall.experiment.repository.ClazzRepository;
import java.util.HashMap;
import java.util.Map;

/**
 * 班級
 *
 * @author user
 */
@RestController
@RequestMapping("/clazz")
public class ClazzController {

	@Autowired
	private ClazzRepository clazzRepository;

	@GetMapping(path = "/", produces = "application/json;charset=UTF-8")
	public String index() {
		JSONObject jsonObject = new JSONObject();

		JSONArray jsonArray = new JSONArray();
		for (Clazz clazz : clazzRepository.findAll()) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", clazz.getId());
			map.put("teacher", clazz.getTeacher().getName());
			map.put("student", clazz.getStudent().getName());
			jsonArray.put(map);
		}
		jsonObject.put("classes", jsonArray);

		return jsonObject.toString();
	}

	@GetMapping("/{id:\\d+}")
	public Clazz getOne(@PathVariable Long id) {
		return clazzRepository.findById(id).get();
	}
}
