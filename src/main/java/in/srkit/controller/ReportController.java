package in.srkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.srkit.entity.CitizenPlan;
import in.srkit.request.SearchRequest;
import in.srkit.service.ReportService;

@Controller
public class ReportController {

	@Autowired
	private ReportService reportService;

	@GetMapping("/pdf")
	public void pdfHandler(HttpServletResponse response) throws Exception {
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment;filename=Plans.pdf");
		reportService.exportPdf(response);
	}

	@GetMapping("/excel")
	public void excelHandler(HttpServletResponse response) throws Exception 
	{
		response.setContentType("application/octet-stream");
		response.addHeader("Content-Disposition", "attachment;filename=plan.xls");
		reportService.exportExcel(response);
	}

	@GetMapping("/")
	public String homePage(Model model)
	{
		model.addAttribute("search", new SearchRequest());
		this.init(model);
		return "index";
	}

	@PostMapping("/search")
	public String searchHandler(@ModelAttribute("search") SearchRequest request, Model model) 
	{
		List<CitizenPlan> list = reportService.search(request);
		model.addAttribute("records", list);
		init(model);
		return "index";
	}

	public void init(Model model) 
	{
		model.addAttribute("plans", reportService.getPlanNames());
		model.addAttribute("statuses",reportService.getPlanStatuses());
	}

}
