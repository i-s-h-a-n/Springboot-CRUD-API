package com.example.springbootbackend;

import com.example.springbootbackend.model.Downtime;
import com.example.springbootbackend.repository.DowntimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

		@Autowired
		private DowntimeRepository downtimeRepository;

		@Override
		public void run(String... args) throws Exception {
//			Downtime downtime1 = new Downtime();
//			downtime1.setProviderName("Jio");
//			downtime1.setFlowName("na");
//			downtime1.setDowntimeFrom("12:12:12");
//			downtime1.setDowntimeTo("12:12:15");
//			downtimeRepository.save(downtime1);

//			Downtime downtime2 = new Downtime();
//			downtime2.setProviderName("Airtel");
//			downtime2.setFlowName("na");
//			downtime2.setDowntimeFrom("15:12:12");
//			downtime2.setDowntimeTo("16:12:15");
//			downtimeRepository.save(downtime2);
		}
}
