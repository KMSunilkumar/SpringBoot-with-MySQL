package springboot.project.Library.Management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.Library;
import com.project.repository.LibraryRepository;

@controller
public class Librarycontroller {
	@Autowired(required=true)
	private LibraryRepository resp;
	@RequestMapping("Home")
	public String user() {
		return "Home.jsp";
		}
	@RequestMapping("adduser")
	public String adduser(Library library) {
		resp.save(library);
		return "Home.jsp";
	}
	@RequestMapping("getuser")
	public ModelAndView getuser(@RequestParam int accno) {
		ModelAndView mav=new ModelAndView("showuser.jsp");
		Library library=resp.findById(accno).orElse(new Library());
		mav.addObject(library);
		return mav;
		}
	@RequestMapping("deleteuser")
	public ModelAndView deleteuser(@RequestParam int accno) {
		ModelAndView mav=new ModelAndView("deleteuser.jsp");
		Library library=resp.findById(accno).orElse(new Library());
		resp.deleteById(accno);
		mav.addObject(library);
		return mav;
		}
	@RequestMapping("updateuser")
	public ModelAndView deleteuser(Library library) {
		ModelAndView mav=new ModelAndView("updateuser.jsp");
		library=resp.findById(library.getAccno()).orElse(new Library());
		resp.deleteById(library.getAccno());
		mav.addObject(library);
		return mav;
		
	}
	
	}
