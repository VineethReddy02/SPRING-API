package com.springapi.SpringAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {

	@Autowired
	private APIRepositiry apirepository;
	
	public List<Data_Entity> getAll() {
				
		List<Data_Entity> data = new ArrayList<>(Arrays.asList(
				new Data_Entity("ABC","VINEETH",21),
				new Data_Entity("QWE","VIN",22),
				new Data_Entity("RQL","JOHN",23)
				));
				apirepository.findAll()
				.forEach(data::add);
				return data;
	}
	
	public Data_Entity getdata(String Unique_ID) {
		return apirepository.findById(Unique_ID).get();
	}
	
	public Data_Entity adddata(Data_Entity data) {
		return apirepository.save(data);
	}
	
	public Data_Entity updatedata(String id,Data_Entity data) {
		return apirepository.save(data);
	}
	
	public void deletedata(Data_Entity data) {
		 apirepository.delete(data);
	}
}
