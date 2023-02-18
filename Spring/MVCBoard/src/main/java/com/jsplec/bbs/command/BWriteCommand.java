package com.jsplec.bbs.command;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.dao.BDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String path = request.getRealPath("uploadedFiles");
		
		int size = 1024 * 1024 * 20; //20MB 파일 사이즈 설정 
		String str = null;
		String filename = null;	//업로드한 파일이름, 서버에 중복된 파일 이름이 존재할 경우 처리하기 위해-originalFileName
		String original_filename = null;
		
		MultipartRequest multiRequest = new MultipartRequest(request, path, size, "EUC-KR", new DefaultFileRenamePolicy());
		
		
		//전송한 전체 파일이름들을 가져온다. 
		Enumeration files = multiRequest.getFileNames();
		str = (String)files.nextElement();
		
		
		//파일명 중복이 발생했을 때 정책에 의해 뒤에 1,2,3 처럼 숫자가 붙어 고유 파일명을 생성한다.
		//이때 생성된 이름을 FilesystemName이라고 하여 그 이름 정보를 가져온다. (중복처리)
		filename = multiRequest.getFilesystemName(str);
		//실제 파일 이름을 가져온다. 
		original_filename = multiRequest.getOriginalFileName(str);
		
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bImage = request.getParameter("filename");
		
		
    	
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent, bImage);
		
		System.out.println("bname : " + bName);
		System.out.println("bTitle : " + bTitle);
		System.out.println("bcontent : " + bContent);
		System.out.println("bImage : " + bImage);
	}

}
