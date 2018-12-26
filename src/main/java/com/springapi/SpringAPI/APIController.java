package com.springapi.SpringAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class APIController {
	@Autowired
	private APIService apiservice;
	
	@RequestMapping("/API/get-all")
	public List<Data_Entity> getAll() {
		return apiservice.getAll();
	}
	
	@RequestMapping("API/{id}")
	public Data_Entity getdata(@PathVariable String id) {
		return apiservice.getdata(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/data")
	public void adddata(@RequestBody Data_Entity data){
		apiservice.adddata(data);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/data/{id}")
	public void updatedata(@RequestBody Data_Entity data, @PathVariable String id){
		apiservice.updatedata(id, data);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/data")
	public void deletedata(@RequestBody Data_Entity data){
		apiservice.deletedata(data);
	}
}
