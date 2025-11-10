package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factory;
import com.example.demo.service.DocuementService;
import com.example.demo.service.ExcelSeviceImpl;
import com.example.demo.service.PDFserviceImpl;

@RestController
public class DocumentController {

	DocuementService docuementService;
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		DocuementService docuementService = Factory.createObject(type);
		
		return docuementService.printData();
	}
	
	
}
