package com.bigbigmall.experiment.controller;

import com.bigbigmall.experiment.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.json.JSONArray;
import org.json.JSONObject;
import com.bigbigmall.experiment.repository.TeacherRepository;
import java.util.HashMap;
import java.util.Map;

/**
 * 老師
 *
 * @author user
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@GetMapping(path = "/", produces = "application/json;charset=UTF-8")
	public String index() {
		JSONObject jsonObject = new JSONObject();

		JSONArray jsonArray = new JSONArray();
		for (Teacher teacher : teacherRepository.findAll()) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", teacher.getId());
			map.put("name", teacher.getName());

			jsonArray.put(map);
		}
		jsonObject.put("teachers", jsonArray);

		return jsonObject.toString();
	}

	@GetMapping("/{id:\\d+}")
	public Teacher getOne(@PathVariable Short id) {
		return teacherRepository.findById(id).get();
	}
}
