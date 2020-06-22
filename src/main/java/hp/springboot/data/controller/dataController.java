package hp.springboot.data.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dataController {
	
	dataRepository DataRepository;
	
	@Autowired
	public dataController(dataRepository DataRepository) {
		this.DataRepository = DataRepository;
	}
	
	public static List<data> store = new ArrayList<data>();

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public List<data> getAll() throws FileNotFoundException
	{
		return DataRepository.findAll();
		
	}
	
	/*@RequestMapping(value = "/lessThan/{number}", method = RequestMethod.GET)
	public static List<data> getNumberLessThan(@PathVariable int number) throws FileNotFoundException
	{
		store = DataServ.getAllData();
		
		return store.stream().filter(x -> x.getValue() <= number).collect(Collectors.toList());
		
	}*/

}
