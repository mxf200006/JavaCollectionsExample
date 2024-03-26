package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static List<Person> readData(String filePath) {
        List<Person> persons = new ArrayList<>();
        
        try {
        	FileInputStream  br = new FileInputStream (new File(filePath));
        	try (Scanner sc = new Scanner(br)) {
				while (sc.hasNext()) {
				    String[] parts = sc.nextLine().split(",");
				    if (parts.length == 7) {
				    	long id = Long.parseLong(parts[0].replace("-", ""));
				        String name = parts[1];
				        String email = parts[2];
				        Gender gender = Gender.getGender(parts[3]);
				        String department = parts[4];
				        long contactInfo =  Long.parseLong(parts[5].replace("-", ""));
				        double salary = Double.parseDouble(parts[6]);
				        
				        Person person = new Person(id, name, email, gender, department, contactInfo, salary);
				        persons.add(person);
				    }
				}
			}
        } catch (NumberFormatException| IOException e) {
            e.printStackTrace();
        }
        
        return persons;
    }
}