package netgloo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import netgloo.manage.ManageStudent;


@Controller
public class MainControler {

	@RequestMapping("/")
	public String welcome(ModelMap model) {

		model.addAttribute("data", ManageStudent.getStudents());

		return "welcome";
	}

	@GetMapping("/add")
	public String showAddStudent() {

		return "addForm";
	}

	@PostMapping("/add")
	public String addStudent(ModelMap model, @ModelAttribute("id") Long id,@ModelAttribute("name") String name,@ModelAttribute("age") String age) {

		ManageStudent.addStudent(id,name,age);
		model.addAttribute("data", ManageStudent.getStudents());

		return "welcome";
	}

	@GetMapping("/delete")
	public String deleteStudent(ModelMap model, @ModelAttribute("id") Long id) {

		ManageStudent.deleteStudent(id);
		model.addAttribute("data", ManageStudent.getStudents());

		return "welcome";
	}

	@GetMapping("/edit")
	public String showEditStudent(ModelMap model, @ModelAttribute("id") Long id) {

		model.addAttribute("data", ManageStudent.showEditStudent(id));

		return "editForm";
	}

	@PostMapping("/edit")
	public String editStudent(ModelMap model,@ModelAttribute("id") Long checkId,@ModelAttribute("name") String name,@ModelAttribute("age") String age) {

		ManageStudent.editStudent(name, age, checkId);
		model.addAttribute("data", ManageStudent.getStudents());

		return "welcome";
	}
}