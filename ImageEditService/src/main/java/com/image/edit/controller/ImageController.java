package com.image.edit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.image.edit.models.resize.ResizeRequest;
import com.image.edit.models.resize.ResizeResponse;

@RestController
public class ImageController {

	@Autowired
//	private ImageResizeService imageResizeService;

	@RequestMapping(method = RequestMethod.POST, value = "/resize")
	public ResponseEntity<ResizeResponse> imageReSize(@RequestBody ResizeRequest resizeReq) throws Exception{

		System.out.println("in resize api ");
		System.out.println(resizeReq.getImageName());
		System.out.println(resizeReq.getImageWidth());
		System.out.println(resizeReq.getImageHeight());
		System.out.println(resizeReq.getImageBinary());

		//本サービス　イメージリサイズ
//		imageResizeService.testFIle(resizeReq);

//		imageResizeService
		ResizeResponse resizeRes = new ResizeResponse();
		resizeRes.setResult("ok");
		return new ResponseEntity<ResizeResponse> (resizeRes, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/test")
	public String test(){

		return "hello test api";
	}

}
