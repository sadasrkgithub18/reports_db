package in.srkit.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import in.srkit.repo.CitizenPlanRepository;

import in.srkit.entity.*;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		
		repo.deleteAll();
		
		// Cash Plan Data
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Adam");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);

		// Cash Plan Data
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Alexander");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");

		// Cash Plan Data
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Blake");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employed");

		// Cash Plan Data
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Angela");
		c4.setGender("Fe-Male");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(5000.00);

		// Cash Plan Data
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Alison");
		c5.setGender("Fe-Male");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Rental Income");

		// Cash Plan Data
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Bella");
		c6.setGender("Fe-Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("Employed");

		// Food Plan Data
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Andrew");
		c7.setGender("Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(5000.00);

		// Food Plan Data
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Cameron");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Rental Income");

		// Food Plan Data
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Charles");
		c9.setGender("Male");
		c9.setPlanName("Food");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5000.00);
		c9.setTerminatedDate(LocalDate.now());
		c9.setTerminationRsn("Employed");

		// Food Plan Data
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Carolyn");
		c10.setGender("Fe-Male");
		c10.setPlanName("Food");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(5000.00);

		// Food Plan Data
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Diana");
		c11.setGender("Fe-Male");
		c11.setPlanName("Food");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Rental Income");

		// Food Plan Data
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Dorothy");
		c12.setGender("Fe-Male");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(5000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationRsn("Employed");

		// Medical Plan Data
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("David");
		c13.setGender("Male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmt(5000.00);

		// Medical Plan Data
		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Edward");
		c14.setGender("Male");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Denied");
		c14.setDenialReason("Rental Income");

		// Medical Plan Data
		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Harry");
		c15.setGender("Male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Terminated");
		c15.setPlanStartDate(LocalDate.now().minusMonths(4));
		c15.setPlanEndDate(LocalDate.now().plusMonths(6));
		c15.setBenefitAmt(5000.00);
		c15.setTerminatedDate(LocalDate.now());
		c15.setTerminationRsn("Employed");

		// Medical Plan Data
		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Jennifer");
		c16.setGender("Fe-Male");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Approved");
		c16.setPlanStartDate(LocalDate.now());
		c16.setPlanEndDate(LocalDate.now().plusMonths(6));
		c16.setBenefitAmt(5000.00);

		// Medical Plan Data
		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Jessica");
		c17.setGender("Fe-Male");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Denied");
		c17.setDenialReason("Rental Income");

		// Medical Plan Data
		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Katherine");
		c18.setGender("Fe-Male");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated");
		c18.setPlanStartDate(LocalDate.now().minusMonths(4));
		c18.setPlanEndDate(LocalDate.now().plusMonths(6));
		c18.setBenefitAmt(5000.00);
		c18.setTerminatedDate(LocalDate.now());
		c18.setTerminationRsn("Employed");

		// Employment Plan Data
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("James");
		c19.setGender("Male");
		c19.setPlanName("Employment");
		c19.setPlanStatus("Approved");
		c19.setPlanStartDate(LocalDate.now());
		c19.setPlanEndDate(LocalDate.now().plusMonths(6));
		c19.setBenefitAmt(5000.00);

		// Employment Plan Data
		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Joseph");
		c20.setGender("Male");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Denied");
		c20.setDenialReason("Rental Income");

		// Employment Plan Data
		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Kevin");
		c21.setGender("Male");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Terminated");
		c21.setPlanStartDate(LocalDate.now().minusMonths(4));
		c21.setPlanEndDate(LocalDate.now().plusMonths(6));
		c21.setBenefitAmt(5000.00);
		c21.setTerminatedDate(LocalDate.now());
		c21.setTerminationRsn("Employed");

		// Employment Plan Data
		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Olivia");
		c22.setGender("Fe-Male");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Approved");
		c22.setPlanStartDate(LocalDate.now());
		c22.setPlanEndDate(LocalDate.now().plusMonths(6));
		c22.setBenefitAmt(5000.00);

		// Employment Plan Data
		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Michelle");
		c23.setGender("Fe-Male");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Denied");
		c23.setDenialReason("Rental Income");

		// Employment Plan Data
		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Rebecca");
		c24.setGender("Fe-Male");
		c24.setPlanName("Employment");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(4));
		c24.setPlanEndDate(LocalDate.now().plusMonths(6));
		c24.setBenefitAmt(5000.00);
		c24.setTerminatedDate(LocalDate.now());
		c24.setTerminationRsn("Employed");

		
		
		
		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5,
				c6, c7, c8, c9, c10,c11, c12, c13, c14, c15, c16, 
				c17, c18, c19, c20, c21, c22, c23, c24);
		
		repo.saveAll(list);
	}

}
