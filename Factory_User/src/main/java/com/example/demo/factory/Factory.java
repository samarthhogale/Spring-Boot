package com.example.demo.factory;

import com.example.demo.service.DocuementService;
import com.example.demo.service.ExcelSeviceImpl;
import com.example.demo.service.PDFserviceImpl;

public class Factory {
	
      public static DocuementService createObject(String type)
	{
		if(type.equals("pdf"))
			return new PDFserviceImpl();
		
		if(type.equals("excel"))
			return new ExcelSeviceImpl();
	
	
		return null;
	}

}
