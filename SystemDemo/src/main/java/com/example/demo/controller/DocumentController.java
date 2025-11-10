package com.example.demo.controller;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocuementService;

@RestController
public class DocumentController {

    private final ExcelServiceImpl excelServiceImpl;

    private final PdfServiceImpl pdfServiceImpl;

@Autowired
ApplicationContext  applicationContext;

    DocumentController(PdfServiceImpl pdfServiceImpl, ExcelServiceImpl excelServiceImpl) {
        this.pdfServiceImpl = pdfServiceImpl;
        this.excelServiceImpl = excelServiceImpl;
    }
	
    
    @GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		DocuementService docuementService = null;
		
		if(type.equals("pdf")) {
			docuementService = (DocuementService) applicationContext.getBean("pdfServiceImpl");
			return docuementService.PrintInvoice();
		}
			
			if(type.equals("excel"))
			{		docuementService =
				(DocuementService) applicationContext.getBean("excelServiceImpl");
			return docuementService.PrintInvoice();
			}
			return "invalid";
	}
	
}
