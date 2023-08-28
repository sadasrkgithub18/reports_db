package in.srkit.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import in.srkit.entity.CitizenPlan;
import in.srkit.request.SearchRequest;

public interface ReportService {

	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public void exportExcel(HttpServletResponse response) throws Exception ;
	
	public void exportPdf(HttpServletResponse response) throws Exception;
	
}
