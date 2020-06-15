package netgloo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import netgloo.service.IStudentService;


@Controller
public class MainControler {
	
	@Autowired
	private IStudentService iStudentService;

	@RequestMapping("/")
	public String welcome(ModelMap model) {

		model.addAttribute("data", iStudentService.getStudents());

		return "welcome";
	}

	@GetMapping("/add")
	public String showAddStudent() {

		return "addForm";
	}

	@PostMapping("/add")
	public String addStudent(ModelMap model, @ModelAttribute("id") Long id,@ModelAttribute("name") String name,@ModelAttribute("age") String age) {

		iStudentService.addStudent(id,name,age);
		model.addAttribute("data", iStudentService.getStudents());

		return "welcome";
	}

	@GetMapping("/delete")
	public String deleteStudent(ModelMap model, @ModelAttribute("id") Long id) {

		iStudentService.deleteStudent(id);
		model.addAttribute("data", iStudentService.getStudents());

		return "welcome";
	}

	@GetMapping("/edit")
	public String showEditStudent(ModelMap model, @ModelAttribute("id") Long id) {

		model.addAttribute("data", iStudentService.showEditStudent(id));

		return "editForm";
	}

	@PostMapping("/edit")
	public String editStudent(ModelMap model,@ModelAttribute("id") Long checkId,@ModelAttribute("name") String name,@ModelAttribute("age") String age) {

		iStudentService.editStudent(name, age, checkId);
		model.addAttribute("data", iStudentService.getStudents());

		return "welcome";
	}
}