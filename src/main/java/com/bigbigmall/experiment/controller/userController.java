/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigbigmall.experiment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class userController {

	@RequestMapping("/")
	/**
	 *
	 * @return "123"
	 */
	public String index() {
		return "123";
	}
;

}
