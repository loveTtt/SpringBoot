package com.saas.controller;
import	java.util.List;

import com.saas.entity.FuiouTerm;
import com.saas.entity.HfnsTerm;
import com.saas.service.FuioTermServer;
import com.saas.service.HfnsTermService;
import com.saas.service.impl.CalyxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private HfnsTermService hfnsTermService;
    @Autowired
    private FuioTermServer fuioTermServer;
    @GetMapping("hello")
    public String getTest(){
        return "Hello world";
    }
    @GetMapping("getAll")
    public List<HfnsTerm> getAll() {
        List<HfnsTerm> termList = hfnsTermService.getHfnsTerm();
        return termList;
    }
    @GetMapping("getCount")
    public String getCount(){
        return hfnsTermService.getCount().toString();
    }
    @GetMapping("getByHfnsTerm/{id}")
    public HfnsTerm getByHfnsTerm(@PathVariable Long id){
        return hfnsTermService.getByHfnsTerm(id);
    }
    @GetMapping("getByFuioTerm/{id}")
    public FuiouTerm getByFuioTerm(@PathVariable Long id){
        return fuioTermServer.getByFuioTerm(id);
    }
}
