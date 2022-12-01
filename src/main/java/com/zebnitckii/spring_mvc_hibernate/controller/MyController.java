package com.zebnitckii.spring_mvc_hibernate.controller;

import com.zebnitckii.spring_mvc_hibernate.entity.Customer;
import com.zebnitckii.spring_mvc_hibernate.entity.Employee;
import com.zebnitckii.spring_mvc_hibernate.entity.Position;
import com.zebnitckii.spring_mvc_hibernate.entity.Project;
import com.zebnitckii.spring_mvc_hibernate.service.CustomerService;
import com.zebnitckii.spring_mvc_hibernate.service.EmployeeService;
import com.zebnitckii.spring_mvc_hibernate.service.PositionService;
import com.zebnitckii.spring_mvc_hibernate.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String showMainView() {
        return "main-view";
    }

    @RequestMapping("/allEmployees")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        employeeService.saveEmployee(employee);

        return "redirect:/allEmployees";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {

        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);

        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {

        employeeService.deleteEmployee(id);

        return "redirect:/allEmployees";
    }

    @RequestMapping("/projectsEmployee")
    public String projectsEmployee(@RequestParam("empId")  int id, Model model) {

        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);

        return "projects-employee";
    }

    @RequestMapping("/employeesWithoutProject")
    public String employeesWithoutProject(Model model) {

        List<Employee> employees = employeeService.getAllEmployeesWithoutProject();
        model.addAttribute("employees", employees);

        return "emp-without-project";
    }

    @RequestMapping("/addProjectsEmployee")
    public String addProjectsEmployee(@RequestParam("empId") int id,Model modelEmp, Model modelProject) {

        Employee employee = employeeService.getEmployee(id);
        modelEmp.addAttribute("employee", employee);
        List<Project> projects = projectService.getAllProjects();
        modelProject.addAttribute("allProjects", projects);

        return "add-project-employee";
    }

    @RequestMapping("/addProjectToEmployee")
    public String addProjectToEmployee(@RequestParam("empId") int empId, @RequestParam("prId") int prId) {

        Employee employee = employeeService.getEmployee(empId);
        Project project = projectService.getProject(prId);
        employee.addProjectToEmployee(project);
        employeeService.saveEmployee(employee);

        return "redirect:/allEmployees";
    }

    @RequestMapping("/allProjects")
    public String showAllProject(Model model) {

        List<Project> projects = projectService.getAllProjects();
        model.addAttribute("allProjects", projects);

        return "all-projects";
    }

    @RequestMapping("/employeesProject")
    public String employeesProject(@RequestParam("prId") int id, Model model) {

        Project project = projectService.getProject(id);
        model.addAttribute("project", project);

        return "employees-project";
    }

    @RequestMapping("/addNewProject")
    public String addNewProject(Model model){

        Project project = new Project();
        model.addAttribute("project", project);

        return "project-info";
    }

    @RequestMapping("/updateProject")
    public String updateProject(@RequestParam("prId") int id, Model model) {

        Project project = projectService.getProject(id);
        model.addAttribute("project", project);

        return "project-info";
    }

    @RequestMapping("/saveProject")
    public String saveProject(@ModelAttribute("project") Project project) {

        projectService.saveProject(project);

        return "redirect:/allProjects";
    }

    @RequestMapping("/deleteProject")
    public String deleteProject(@RequestParam("prId") int id) {

        projectService.deleteProject(id);

        return "redirect:/allProjects";
    }

    @RequestMapping("/allPositions")
    public String allPositions(Model model) {

        List<Position> positions = positionService.getPositions();
        model.addAttribute("allPosition", positions);

        return "all-positions";
    }

    @RequestMapping("/deletePosition")
    public String deletePosition(@RequestParam("posId") int id) {

        positionService.deletePosition(id);

        return "redirect:/allPositions";
    }

    @RequestMapping("/addNewPosition")
    public String addNewPosition(Model model) {

        Position position = new Position();
        model.addAttribute("position", position);

        return "position-info";
    }

    @RequestMapping("/savePosition")
    public String savePosition(@ModelAttribute("position") Position position) {

        positionService.savePosition(position);

        return "redirect:/allPositions";
    }

    @RequestMapping("/updatePosition")
    public String updatePosition(@RequestParam("posId") int id, Model model) {

        Position position = positionService.getPosition(id);
        model.addAttribute("position", position);

        return "position-info";
    }

    @RequestMapping("/allCustomers")
    public String showAllCustomer(Model model) {

        List<Customer> customers = customerService.getAllCustomer();
        model.addAttribute("allCustomers", customers);

        return "all-customers";
    }

    @RequestMapping("/addNewCustomer")
    public String addNewCompany(Model model) {

        Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "customer-info";
    }

    @RequestMapping("/updateCustomer")
    public String updateCustomer(@RequestParam("csId") int id, Model model) {

        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);

        return "customer-info";
    }

    @RequestMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {

        customerService.saveCustomer(customer);

        return "redirect:/allCustomers";
    }

    @RequestMapping("/projectsCustomer")
    public String projectsCustomer(@RequestParam("csId") int id, Model model) {

        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer", customer);

        return "projects-customer";
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("csId") int id) {

        customerService.deleteCustomer(id);

        return "redirect:/allCustomers";
    }
}
