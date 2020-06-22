package hp.springboot.data.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class databaseSeeder implements CommandLineRunner{
	private dataRepository DataRepository;

	@Autowired
	public databaseSeeder(dataRepository DataRepository)
	{
		this.DataRepository = DataRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		List<data> info = new ArrayList<data>();
		Calendar cal = Calendar.getInstance(); 

		File file = new File("G:\\Test\\test.txt"); 
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) 
		{
			String str = sc.nextLine();
			String[] values = str.split(",");

			if (values.length <= 3)
			{
				Date date1 = new SimpleDateFormat("ddMMyyyyHHmmss").parse(values[0]);  

				cal.setTime(date1);  

				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH); 
				int year = cal.get(Calendar.YEAR);
				int hour = cal.get(Calendar.HOUR);
				int minutes = cal.get(Calendar.MINUTE);
				int seconds = cal.get(Calendar.SECOND);

				info.add(new data(day, month, year, hour, minutes, seconds, Integer.parseInt(values[1]), values[2]));
			}            

		}

		DataRepository.saveAll(info);

	}

}
