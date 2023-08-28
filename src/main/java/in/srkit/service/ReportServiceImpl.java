package in.srkit.service;

import java.io.File;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import in.srkit.entity.CitizenPlan;
import in.srkit.repo.CitizenPlanRepository;
import in.srkit.request.SearchRequest;
import in.srkit.utils.ExcelGenerator;
import in.srkit.utils.PdfGenerator;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;

	@Autowired
	private ExcelGenerator excelGenerator;

	@Autowired
	private PdfGenerator pdfGenerator;

 
	
	@Override
	public List<String> getPlanNames()
	{
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() 
	{
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		// System.out.println(request);
		
		CitizenPlan entity = new CitizenPlan();

		if(null != request.getPlanName() && !"".equals(request.getPlanName()))
		{
			entity.setPlanName(request.getPlanName());
		}
		
		
		if(null != request.getPlanStatus() && !"".equals(request.getPlanStatus()))
		{
			entity.setPlanStatus(request.getPlanStatus());
		}
		
		if(null != request.getGender() && !"".equals(request.getGender()))
		{
			entity.setGender(request.getGender());
		}
		
		
		if(null != request.getPlanStartDate() && !"".equals(request.getPlanStartDate()))
		{
			String startDate = request.getPlanStartDate();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			// Converting String to LocalDate
			
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			
			entity.setPlanStartDate(localDate);
			
		}
		
		
	
		
		
		if(null != request.getPlanEndDate() && !"".equals(request.getPlanEndDate()))
		{
			String endDate = request.getPlanEndDate();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			// Converting String to LocalDate
			
			LocalDate localDate = LocalDate.parse(endDate, formatter);
			
			entity.setPlanEndDate(localDate);
			
		}
		
		
		return planRepo.findAll(Example.of(entity));
		
	}

	@Override
	public void exportExcel(HttpServletResponse response) throws Exception 
	{
		List<CitizenPlan> records = planRepo.findAll();
		File file = new File("Plan.xls");
		excelGenerator.generator(response, records,file);
	}

	@Override
	public void exportPdf(HttpServletResponse response) throws Exception 
	{
		List<CitizenPlan> plans = planRepo.findAll();
		File file = new File("Plan.pdf");
		
		pdfGenerator.generatePdf(response, plans,file);
	}

}
