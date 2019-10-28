package com.dinein.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.dinein.model.FileUploader;

public class FileValidator implements Validator{

	 public boolean supports(Class<?> paramClass) {
	        return FileUploader.class.equals(paramClass);
	    }
	 
	 @Override
	    public void validate(Object obj, Errors errors) {
	    	FileUploader file = (FileUploader) obj;
	          if (file.getFile().getSize() == 0) {
	           errors.rejectValue("file", "valid.file");
	          }
	    }

		
}
