package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.common.PrefectureEnum;
import com.example.demo.dto.PrefectureDto;

@Controller
public class TopController {

	@RequestMapping("/")
	public String top(HttpSession session, Model model) {

		List<PrefectureDto> prefList = new ArrayList<>();

		for (PrefectureEnum m : PrefectureEnum.values()) {
			PrefectureDto dto = new PrefectureDto();
			dto.setPrefCode(m.getCode());
			dto.setPrefName(m.getFullName());
			prefList.add(dto);
		}
		model.addAttribute("prefList", prefList);

		return "top";
	}
}
