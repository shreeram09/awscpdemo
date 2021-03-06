package com.shreeram.awscpdemo;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.ModelAndView;

@Path("/home")
public class AppController {
    
    @GetRoute("/welcome")
    public ModelAndView welcome(){
        ModelAndView mView = new ModelAndView("home.html");
        return mView;
    }
}
