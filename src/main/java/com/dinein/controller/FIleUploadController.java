package com.dinein.controller;


import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dinein.model.FileUploader;
import com.dinein.validator.DineInMgmtValidator;
import com.dinein.validator.FileValidator;

@Controller
public class FIleUploadController {

	@Autowired
	   ServletContext context; 
	
FileValidator dineValidator=new FileValidator();
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.addValidators(dineValidator);
	}

	   @RequestMapping(value = "/fileUploadPage", method = RequestMethod.GET)
	   public ModelAndView fileUploadPage() {
	      FileUploader file = new FileUploader();
	      ModelAndView modelAndView = new ModelAndView("fileupload", "command", file);
	      return modelAndView;
	   }

	/*
	 * @RequestMapping(method = RequestMethod.POST) public String fileUploaded(Model
	 * model, @Validated FileUploader file, BindingResult result) {
	 * 
	 * String returnVal = "successFile"; if (result.hasErrors()) { returnVal =
	 * "error"; } else { MultipartFile multipartFile = file.getFile(); } return
	 * returnVal; }
	 */
	   
	   @RequestMapping(value="/fileUploadPage", method = RequestMethod.POST)
	   public String fileUpload(@Validated FileUploader file, BindingResult result, ModelMap model) throws IOException {
	      if (result.hasErrors()) {
	         System.out.println("validation errors");
	         return "error";
	      } else {            
	         System.out.println("Fetching file");
	         MultipartFile multipartFile = file.getFile();
	         String uploadPath="F:/SingleFileUpload";  
	         //Now do something with file...
	         FileCopyUtils.copy(file.getFile().getBytes(), new File(uploadPath+file.getFile().getOriginalFilename()));
	         String fileName = multipartFile.getOriginalFilename();
	         model.addAttribute("fileName", fileName);
	         return "successFile";
	      }
	   }
	}


