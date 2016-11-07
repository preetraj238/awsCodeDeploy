package com.preet.raj.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Preet on 9/18/2016.
 */
@RestController
@RequestMapping("/dataModel")
public class DataModelServices {

    private static Logger logger = Logger.getLogger(DataModelServices.class);

    @Value("${fbUrl}")
    String fbUrl;

    @RequestMapping("/bigData")
    public Map<String,List> allDataModels(){
        Map<String,List> dataModel =  new HashMap<>();
        List<String> data = new ArrayList<>();
        data.add("2.0");
        dataModel.put("sparkModel",data);

        return dataModel;
    }

    @RequestMapping("/rest")
    public Map<String,List> allRestFullDataModels(){
        Map<String,List> dataModel =  new HashMap<>();
        List<String> data = new ArrayList<>();
        data.add("2.0");
        dataModel.put("rest",data);
        logger.info("successfully generated rest model with size: "+ dataModel.size());
        return dataModel;
    }
}
