package com.bigbigmall.experiment.controller;

import com.bigbigmall.experiment.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bigbigmall.experiment.repository.StudentRepository;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 學生
 * 
 * @author user
 */
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping(path = "/", produces = "application/json;charset=UTF-8")
	public String index() {
		JSONObject jsonObject = new JSONObject();

		JSONArray jsonArray = new JSONArray();
		for (Student student : studentRepository.findAll()) {
			Map<String, Object> map = new HashMap<>();
			map.put("id", student.getId());
			map.put("name", student.getName());

			jsonArray.put(map);
		}
		jsonObject.put("student", jsonArray);

		return jsonObject.toString();
	}

	@GetMapping("/{id:\\d+}")
	public Student getOne(@PathVariable Integer id) {
		return studentRepository.findById(id).get();
	}
}
