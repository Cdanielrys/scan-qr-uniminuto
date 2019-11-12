package intranet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import intranet.model.UserCredential;

//@Controller
public class LoginController {

private static final Log LOG = LogFactory.getLog(LoginController.class);
	
//	@GetMapping("/rrry")
//	public String redirectToLogin() {
//		LOG.info("-METHOD: redirectToLogin()");
//		return "redirect:/login";
//	}
//	
//	@GetMapping("/login") 
//	public String showLoginFrom(Model model, 
//			@RequestParam(name="error", required=false)String error,
//			@RequestParam(name="logout", required=false) String logout) {
//		LOG.info("-METHOD: showLoginFrom() -- PARAMS: "+"error= "+ error +"logout"+ logout );
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
//		return "login";
//	}
//	
//	@PostMapping("/logincheck")
//	public String logincheck(@ModelAttribute(name="userSkillnet") UserCredential userCredential) {
//		
//		LOG.info("-METHOD: showLoginFrom() -- PARAMS: "+userCredential.toString() );
//		if (userCredential.getUsername().equals("admin") && userCredential.getPassword().equals("admin")) {
//			LOG.info("Returning to clientes view");
//			return "layout";
//		}else if (userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")) {
//			return "layout";
//		}
//		LOG.info("Redirect to login?error");
//		return "redirect:/login?error";
//	}
//	
//	@GetMapping("/logout")
//	public ModelAndView logout(HttpServletRequest request) throws ServletException {
//		request.logout();
//		return new ModelAndView("redirect:http://auth-server/auth/realms/skillnetsso/protocol/openid-connect/logout?redirect_uri=encodedRedirectUri");
//	}
	
}
