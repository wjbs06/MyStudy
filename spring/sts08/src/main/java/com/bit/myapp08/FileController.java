package com.bit.myapp08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	String filePath="C:\\Downloads\\MyStudy\\spring\\upload\\";
	
	@RequestMapping("/add")
	public String form() {
		
		return "uploadForm";
	}
	
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@RequestParam("sabun") int sabun,
			@RequestParam("file") MultipartFile file,
			Model model) throws IOException {
		System.out.println(sabun);
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		String reFilename=file.getOriginalFilename()+"@@@"+System.currentTimeMillis();
		File target=new File(filePath+reFilename);
		file.transferTo(target);
		
//		InputStream is=null;
//		FileOutputStream fos=null;
//		BufferedInputStream bis=null;
//		BufferedOutputStream bos=null;
//		try {
//			is=file.getInputStream();
//			fos= new FileOutputStream(target);
//			bis= new BufferedInputStream(is);
//			bos= new BufferedOutputStream(fos);
//			byte[] buff=new byte[256];
//			int su=0;
//			while((su=bis.read(buff))>0) {
//				bos.write(buff,0,su);
//			}
//			bos.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			is.close();
//			fos.close();
//		}
		model.addAttribute("editFile", reFilename);
		model.addAttribute("originFile", file.getOriginalFilename());
		return "result";
	}
	
	@RequestMapping("/download")
	public void download(String file,String origin,HttpServletResponse res) throws IOException {
		File source=new File(filePath+file);
		byte[] buff=new byte[128];
		
		res.setContentType("application/octet-stream; charset=UTF-8"); 
		res.setHeader("Context-Disposition", "attachment; filename=\""+origin+"\"");
		
		FileInputStream fis=null;
		ServletOutputStream os=null;
		try {
			fis=new FileInputStream(source);
			os=res.getOutputStream();
			FileCopyUtils.copy(fis, os);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
		}
	}
	
	@RequestMapping("/{orgin}")
	public void down(String file,@RequestParam("origin") String origin,HttpServletResponse res) throws IOException {
		File source=new File(filePath+file);
		byte[] buff=new byte[128];
		
		res.setContentType("application/octet-stream; charset=UTF-8"); 
		
		FileInputStream fis=null;
		ServletOutputStream os=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
			fis=new FileInputStream(source);
			os=res.getOutputStream();
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(os);
			
			int su=0;
			while((su=bis.read(buff))>0) {
				bos.write(buff,0,su);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fis.close();
			os.close();
		}
	}
}

