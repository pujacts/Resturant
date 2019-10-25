package com.dinein.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dinein.exception.DIneInMgmtException;
import com.dinein.model.DineInForm;
import com.dinein.validator.DineInMgmtValidator;

@Controller
//@RequestMapping("/springexample")
public class DineInMgmtController {

	
	DineInMgmtValidator dineValidator=new DineInMgmtValidator();
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		binder.addValidators(dineValidator);
	}
	@ModelAttribute("resturantList")
	public List<String> populateRestuarntList()
	{
		List<String> restraList=new ArrayList<>();
		restraList.add("Animia");
		restraList.add("hydrabad House");
		restraList.add("fassos");
		return restraList;
	}
	
	@RequestMapping(value="/index")
	public String getIndexPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/dineInForm", method=RequestMethod.GET)
	public String getDineInForm(Locale locale,Model model)
	{
		model.addAttribute("resturantList", populateRestuarntList());
		model.addAttribute("dineInForm", new DineInForm());
		return "dinInForm";
	}
	
	@RequestMapping(value="/save.do", method=RequestMethod.POST)
	public String saveDineInDetail(@Validated  @Valid  DineInForm dineInForm,
			BindingResult res,Model model) throws DIneInMgmtException
	{
		if(res.hasErrors())
		{
			return "dinInForm"; 
		}
		model.addAttribute("dineInForm",dineInForm);
         model.addAttribute("name", dineInForm.getName());
		System.out.println(dineInForm.getMobNo());
		return "success";
	}
}
