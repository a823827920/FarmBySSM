package com.ncuedu.farm.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/11 22:23
 **/
@Controller
public class FileController {


    /*public Map<String,Object> upload(HttpServletRequest request) throws Exception {
        Map<String,Object> map=new HashMap<>();
        DiskFileItemFactory factory=new DiskFileItemFactory();
        ServletFileUpload upload=new ServletFileUpload(factory);
        List<FileItem> items= null;
        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        Iterator<FileItem> i=items.iterator();
        String path="D:\\upload\\";
        while(i.hasNext())
        {
            FileItem fi=(FileItem)i.next();
            String fileName=fi.getName();
            File saveFile=new File(path, fileName);
            fi.write(saveFile);
            map.put("code", 0);
            map.put("data", fileName);
        }
        return map;
    }*/
    @RequestMapping("/file/upload")
    @ResponseBody
    public Map<String,Object> fileupload(MultipartFile file) throws IOException {
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        if(file!=null&&file.getOriginalFilename()!=null&&file.getOriginalFilename().length()>0)
        {
            String filepath="D:\\upload\\";
            String originalFilename = file.getOriginalFilename();
            //扩展名
            String extendName=originalFilename.substring(originalFilename.indexOf("."));
            String newfilename= UUID.randomUUID().toString()+extendName;
            File uploadfile=new File(filepath+newfilename);
            file.transferTo(uploadfile);
            map.put("data",newfilename);
            map.put("code",0);
        }
        return map;
    }
}
